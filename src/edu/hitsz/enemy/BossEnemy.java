package edu.hitsz.enemy;

import edu.hitsz.application.Main;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;

import java.util.LinkedList;
import java.util.List;

/**
 * Boss敌机
 * 高生命值、多种射击模式、必定掉落道具
 * @author hitsz
 */
public class BossEnemy extends AbstractEnemy {

    public BossEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
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
        int speedY = this.getSpeedY() + 8;
        int power = 60;

        // Boss向三个方向发射子弹
        res.add(new EnemyBullet(x, y, 0, speedY, power));
        res.add(new EnemyBullet(x - 20, y, -2, speedY, power));
        res.add(new EnemyBullet(x + 20, y, 2, speedY, power));

        return res;
    }

}
