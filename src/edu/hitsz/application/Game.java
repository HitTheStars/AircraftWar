package edu.hitsz.application;

import edu.hitsz.aircraft.*;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.basic.AbstractFlyingObject;
import edu.hitsz.enemy.*;
import edu.hitsz.prop.AbstractProp;
import edu.hitsz.prop.PropFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.*;

/**
 * 游戏主面板，游戏启动
 * @author hitsz
 */
public class Game extends JPanel {

    private int backGroundTop = 0;

    //调度器, 用于定时任务调度
    private final Timer timer;
    //时间间隔(ms)，控制刷新频率
    private final int timeInterval = 40;

    private final HeroAircraft heroAircraft;
    private final List<AbstractAircraft> enemyAircrafts;
    private final List<BaseBullet> heroBullets;
    private final List<BaseBullet> enemyBullets;
    private final List<AbstractProp> props;

    //屏幕中出现的敌机最大数量
    private final int enemyMaxNumber = 5;

    //敌机生成周期
    protected double enemySpawnCycle  =  20;
    private int enemySpawnCounter = 0;

    //英雄机和敌机射击周期
    protected double shootCycle = 20;
    private int shootCounter = 0;

    //英雄机射击周期
    protected double heroShootCycle = 10;
    private int heroShootCounter = 0;

    //当前玩家分数
    private int score = 0;

    //游戏结束标志
    private boolean gameOverFlag = false;

    // 敌机工厂
    private final EnemyFactory mobEnemyFactory;
    private final EnemyFactory eliteEnemyFactory;
    private final EnemyFactory elitePlusEnemyFactory;
    private final EnemyFactory eliteProEnemyFactory;

    public Game() {
        heroAircraft = HeroAircraft.getHeroAircraft(
                Main.WINDOW_WIDTH / 2,
                Main.WINDOW_HEIGHT - ImageManager.HERO_IMAGE.getHeight() ,
                0, 0, 100);

        enemyAircrafts = new LinkedList<>();
        heroBullets = new LinkedList<>();
        enemyBullets = new LinkedList<>();
        props = new LinkedList<>();

        // 初始化敌机工厂
        mobEnemyFactory = new MobEnemyFactory();
        eliteEnemyFactory = new EliteEnemyFactory();
        elitePlusEnemyFactory = new ElitePlusEnemyFactory();
        eliteProEnemyFactory = new EliteProEnemyFactory();

        //启动英雄机鼠标监听
        new HeroController(this, heroAircraft);

        this.timer = new Timer("game-action-timer", true);

    }

    /**
     * 游戏启动入口，执行游戏逻辑
     */
    public void action() {

        // 定时任务：绘制、对象产生、碰撞判定、及结束判定
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                enemySpawnCounter++;
                if (enemySpawnCounter >= enemySpawnCycle) {
                    enemySpawnCounter = 0;
                    // 产生敌机
                    if (enemyAircrafts.size() < enemyMaxNumber) {
                        // 随机生成4种敌机（Boss除外）
                        double rand = Math.random();
                        EnemyFactory factory;
                        int locationX;
                        int locationY;
                        int speedX;
                        int speedY;
                        int hp;
                        
                        if (rand < 0.4) {
                            // 40%概率产生普通敌机
                            factory = mobEnemyFactory;
                            locationX = (int) (Math.random() * (Main.WINDOW_WIDTH - ImageManager.MOB_ENEMY_IMAGE.getWidth()));
                            locationY = (int) (Math.random() * Main.WINDOW_HEIGHT * 0.05);
                            speedX = 0;
                            speedY = 10;
                            hp = 30;
                        } else if (rand < 0.7) {
                            // 30%概率产生精英敌机
                            factory = eliteEnemyFactory;
                            locationX = (int) (Math.random() * (Main.WINDOW_WIDTH - ImageManager.ELITE_ENEMY_IMAGE.getWidth()));
                            locationY = (int) (Math.random() * Main.WINDOW_HEIGHT * 0.05);
                            speedX = 0;
                            speedY = 10;
                            hp = 60;
                        } else if (rand < 0.85) {
                            // 15%概率产生精锐敌机 - 可左右移动
                            factory = elitePlusEnemyFactory;
                            locationX = (int) (Math.random() * (Main.WINDOW_WIDTH - ImageManager.ELITE_PLUS_ENEMY_IMAGE.getWidth()));
                            locationY = (int) (Math.random() * Main.WINDOW_HEIGHT * 0.05);
                            speedX = (Math.random() > 0.5) ? 3 : -3; // 随机向左或向右
                            speedY = 10;
                            hp = 80;
                        } else {
                            // 15%概率产生王牌敌机 - 可左右移动
                            factory = eliteProEnemyFactory;
                            locationX = (int) (Math.random() * (Main.WINDOW_WIDTH - ImageManager.ELITE_PRO_ENEMY_IMAGE.getWidth()));
                            locationY = (int) (Math.random() * Main.WINDOW_HEIGHT * 0.05);
                            speedX = (Math.random() > 0.5) ? 4 : -4; // 随机向左或向右，速度更快
                            speedY = 12;
                            hp = 100;
                        }
                        
                        enemyAircrafts.add(factory.createEnemy(locationX, locationY, speedX, speedY, hp));
                    }
                }

                // 飞机发射子弹
                shootAction();
                // 子弹移动
                bulletsMoveAction();
                // 飞机移动
                aircraftsMoveAction();
                // 撞击检测
                crashCheckAction();
                // 后处理
                postProcessAction();
                // 重绘界面
                repaint();
                // 游戏结束检查
                checkResultAction();
            }
        };
        // 以固定延迟时间进行执行：本次任务执行完成后，延迟 timeInterval 再执行下一次
        timer.schedule(task,0,timeInterval);

    }

    //***********************
    //      Action 各部分
    //***********************

    private void shootAction() {
        shootCounter++;
        heroShootCounter++;
        if (shootCounter >= shootCycle) {
            shootCounter = 0;
            // 敌机射击
            for (AbstractAircraft enemy : enemyAircrafts) {
                enemyBullets.addAll(enemy.shoot());
            }
        }
        if (heroShootCounter >= heroShootCycle) {
            heroShootCounter = 0;
            //英雄机射击
            heroBullets.addAll(heroAircraft.shoot());
        }
    }

    private void bulletsMoveAction() {
        for (BaseBullet bullet : heroBullets) {
            bullet.forward();
        }
        for (BaseBullet bullet : enemyBullets) {
            bullet.forward();
        }
    }

    private void aircraftsMoveAction() {
        for (AbstractAircraft enemyAircraft : enemyAircrafts) {
            enemyAircraft.forward();
        }
        for (AbstractProp prop : props) {
            prop.forward();
        }
    }


    /**
     * 碰撞检测：
     * 1. 敌机攻击英雄
     * 2. 英雄攻击/撞击敌机
     * 3. 英雄获得补给
     */
    private void crashCheckAction() {
        // 敌机子弹攻击英雄机
        for (BaseBullet bullet : enemyBullets) {
            if (bullet.notValid()) {
                continue;
            }
            if (bullet.crash(heroAircraft) || heroAircraft.crash(bullet)) {
                heroAircraft.decreaseHp(bullet.getPower());
                bullet.vanish();
            }
        }

        // 英雄子弹攻击敌机
        for (BaseBullet bullet : heroBullets) {
            if (bullet.notValid()) {
                continue;
            }
            for (AbstractAircraft enemyAircraft : enemyAircrafts) {
                if (enemyAircraft.notValid()) {
                    // 已被其他子弹击毁的敌机，不再检测
                    // 避免多个子弹重复击毁同一敌机的判定
                    continue;
                }
                if (enemyAircraft.crash(bullet)) {
                    // 敌机撞击到英雄机子弹
                    // 敌机损失一定生命值
                    enemyAircraft.decreaseHp(bullet.getPower());
                    bullet.vanish();
                    if (enemyAircraft.notValid()) {
                        // 获得分数
                        score += 10;
                        // 敌机被击毁时按概率掉落道具
                        if (enemyAircraft instanceof EliteEnemy) {
                            generateEliteProp(enemyAircraft.getLocationX(), enemyAircraft.getLocationY());
                        } else if (enemyAircraft instanceof ElitePlusEnemy) {
                            generateElitePlusProp(enemyAircraft.getLocationX(), enemyAircraft.getLocationY());
                        } else if (enemyAircraft instanceof EliteProEnemy) {
                            generateEliteProProp(enemyAircraft.getLocationX(), enemyAircraft.getLocationY());
                        }
                    }
                }
                // 英雄机 与 敌机 相撞，均损毁
                if (enemyAircraft.crash(heroAircraft) || heroAircraft.crash(enemyAircraft)) {
                    enemyAircraft.vanish();
                    heroAircraft.decreaseHp(Integer.MAX_VALUE);
                }
            }
        }

        // 我方获得道具，道具生效
        for (AbstractProp prop : props) {
            if (prop.notValid()) {
                continue;
            }
            if (prop.crash(heroAircraft) || heroAircraft.crash(prop)) {
                prop.effect(heroAircraft);
                prop.vanish();
            }
        }

    }

    /**
     * 生成精英敌机道具
     * 精英敌机被击毁时掉落道具
     */
    private void generateEliteProp(int x, int y) {
        double rand = Math.random();
        if (rand < 0.4) {
            // 40%概率掉落加血道具
            props.add(PropFactory.getProp("BloodProp", x, y, 0, 5));
        } else if (rand < 0.7) {
            // 30%概率掉落火力道具
            props.add(PropFactory.getProp("BulletProp", x, y, 0, 5));
        } else if (rand < 1.0) {
            // 30%概率掉落超级火力道具
            props.add(PropFactory.getProp("BulletPlusProp", x, y, 0, 5));
        }
    }

    /**
     * 生成精锐敌机道具
     * 精锐敌机可掉落4种道具（不含冰冻）
     */
    private void generateElitePlusProp(int x, int y) {
        double rand = Math.random();
        if (rand < 0.25) {
            // 25%概率掉落加血道具
            props.add(PropFactory.getProp("BloodProp", x, y, 0, 5));
        } else if (rand < 0.5) {
            // 25%概率掉落火力道具
            props.add(PropFactory.getProp("BulletProp", x, y, 0, 5));
        } else if (rand < 0.75) {
            // 25%概率掉落超级火力道具
            props.add(PropFactory.getProp("BulletPlusProp", x, y, 0, 5));
        } else {
            // 25%概率掉落炸弹道具
            props.add(PropFactory.getProp("BombProp", x, y, 0, 5));
        }
    }

    /**
     * 生成王牌敌机道具
     * 王牌敌机可掉落全部5种道具
     */
    private void generateEliteProProp(int x, int y) {
        double rand = Math.random();
        if (rand < 0.2) {
            // 20%概率掉落加血道具
            props.add(PropFactory.getProp("BloodProp", x, y, 0, 5));
        } else if (rand < 0.4) {
            // 20%概率掉落火力道具
            props.add(PropFactory.getProp("BulletProp", x, y, 0, 5));
        } else if (rand < 0.6) {
            // 20%概率掉落超级火力道具
            props.add(PropFactory.getProp("BulletPlusProp", x, y, 0, 5));
        } else if (rand < 0.8) {
            // 20%概率掉落炸弹道具
            props.add(PropFactory.getProp("BombProp", x, y, 0, 5));
        } else {
            // 20%概率掉落冰冻道具
            props.add(PropFactory.getProp("FreezeProp", x, y, 0, 5));
        }
    }

    /**
     * 后处理：
     * 1. 删除无效的子弹
     * 2. 删除无效的敌机
     * 3. 删除无效的道具
     */
    private void postProcessAction() {
        enemyBullets.removeIf(AbstractFlyingObject::notValid);
        heroBullets.removeIf(AbstractFlyingObject::notValid);
        enemyAircrafts.removeIf(AbstractFlyingObject::notValid);
        props.removeIf(AbstractFlyingObject::notValid);
        // 移除出界的道具
        props.removeIf(prop -> prop.getLocationY() > Main.WINDOW_HEIGHT);
    }

    /**
     * 检查游戏是否结束，若结束：关闭线程池
     */
    private void checkResultAction(){
        // 游戏结束检查英雄机是否存活
        if (heroAircraft.getHp() <= 0) {
            timer.cancel(); // 取消定时器并终止所有调度任务
            gameOverFlag = true;
            System.out.println("Game Over!");
        }
    };

    //***********************
    //      Paint 各部分
    //***********************
    /**
     * 重写 paint方法
     * 通过重复调用paint方法，实现游戏动画
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // 绘制背景,图片滚动
        g.drawImage(ImageManager.BACKGROUND_IMAGE, 0, this.backGroundTop - Main.WINDOW_HEIGHT, null);
        g.drawImage(ImageManager.BACKGROUND_IMAGE, 0, this.backGroundTop, null);
        this.backGroundTop += 1;
        if (this.backGroundTop == Main.WINDOW_HEIGHT) {
            this.backGroundTop = 0;
        }

        // 先绘制子弹，后绘制飞机
        // 这样子弹显示在飞机的下层
        paintImageWithPositionRevised(g, enemyBullets);
        paintImageWithPositionRevised(g, heroBullets);
        paintImageWithPositionRevised(g, enemyAircrafts);
        paintImageWithPositionRevised(g, props);

        g.drawImage(ImageManager.HERO_IMAGE, heroAircraft.getLocationX() - ImageManager.HERO_IMAGE.getWidth() / 2,
                heroAircraft.getLocationY() - ImageManager.HERO_IMAGE.getHeight() / 2, null);

        //绘制得分和生命值
        paintScoreAndLife(g);

    }

    private void paintImageWithPositionRevised(Graphics g, List<? extends AbstractFlyingObject> objects) {
        if (objects.isEmpty()) {
            return;
        }

        for (AbstractFlyingObject object : objects) {
            BufferedImage image = object.getImage();
            assert image != null : objects.getClass().getName() + " has no image! ";
            g.drawImage(image, object.getLocationX() - image.getWidth() / 2,
                    object.getLocationY() - image.getHeight() / 2, null);
        }
    }

    private void paintScoreAndLife(Graphics g) {
        int x = 10;
        int y = 25;
        g.setColor(Color.RED);
        g.setFont(new Font("SansSerif", Font.BOLD, 22));
        g.drawString("SCORE: " + this.score, x, y);
        y = y + 20;
        g.drawString("LIFE: " + this.heroAircraft.getHp(), x, y);
    }

}
