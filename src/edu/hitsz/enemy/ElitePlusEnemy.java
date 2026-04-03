package edu.hitsz.enemy;

import edu.hitsz.application.Main;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;

import java.util.LinkedList;
import java.util.List;

/**
 * 精锐敌机
 * 可左右移动、向下直射双排子弹、掉落道具
 * @author hitsz
 */
public class ElitePlusEnemy extends AbstractEnemy {

    public ElitePlusEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }

    @Override
    public void forward() {
        super.forward();
        if (locationY >= Main.WINDOW_HEIGHT) {
            vanish();
        }
    }

    @Override
    public List<BaseBullet> shoot() {
        List<BaseBullet> res = new LinkedList<>();
        int x = this.getLocationX();
        int y = this.getLocationY() + 2;
        int speedY = this.getSpeedY() + 7;
        int power = 50;
        
        // 双排子弹 - 左右各一发
        int offset = 20; // 子弹间距
        res.add(new EnemyBullet(x - offset, y, 0, speedY, power));
        res.add(new EnemyBullet(x + offset, y, 0, speedY, power));
        
        return res;
    }

}
