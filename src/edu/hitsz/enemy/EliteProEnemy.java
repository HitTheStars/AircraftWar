package edu.hitsz.enemy;

import edu.hitsz.application.Main;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;

import java.util.LinkedList;
import java.util.List;

/**
 * 王牌敌机
 * 可左右移动、扇形散射3颗子弹、掉落道具
 * @author hitsz
 */
public class EliteProEnemy extends AbstractEnemy {

    public EliteProEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
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
        int speedY = this.getSpeedY() + 6;
        int power = 40;

        // 扇形散射3颗子弹 - 左、中、右
        res.add(new EnemyBullet(x - 20, y, -2, speedY, power));  // 左侧子弹，向左偏移
        res.add(new EnemyBullet(x, y, 0, speedY, power));         // 中间子弹，直射
        res.add(new EnemyBullet(x + 20, y, 2, speedY, power));   // 右侧子弹，向右偏移

        return res;
    }

}
