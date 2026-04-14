package edu.hitsz.enemy;

import edu.hitsz.application.Main;
import edu.hitsz.shoot.ScatterShootStrategy;

/**
 * 高级精英敌机
 * 可射击、高生命值、可能掉落更多道具
 * @author hitsz
 */
public class ElitePlusEnemy extends AbstractEnemy {

    public ElitePlusEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
        this.shootNum = 3;
        this.power = 50;
        this.direction = 1;
        this.shootStrategy = new ScatterShootStrategy();
    }

    @Override
    public void forward() {
        super.forward();
        if (locationY >= Main.WINDOW_HEIGHT) {
            vanish();
        }
    }

}
