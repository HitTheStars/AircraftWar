package edu.hitsz.enemy;

import edu.hitsz.application.Main;
import edu.hitsz.shoot.DirectShootStrategy;

/**
 * 精英敌机
 * 可射击、可能掉落道具
 * @author hitsz
 */
public class EliteEnemy extends AbstractEnemy {

    public EliteEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
        this.shootNum = 1;
        this.power = 30;
        this.direction = 1;
        this.shootStrategy = new DirectShootStrategy();
    }

    @Override
    public void forward() {
        super.forward();
        if (locationY >= Main.WINDOW_HEIGHT) {
            vanish();
        }
    }

}
