package edu.hitsz.enemy;

import edu.hitsz.application.Main;
import edu.hitsz.shoot.DirectShootStrategy;

/**
 * 强化精英敌机
 * 可射击、更高生命值、可能掉落道具
 * @author hitsz
 */
public class EliteProEnemy extends AbstractEnemy {

    public EliteProEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
        this.shootNum = 1;
        this.power = 40;
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
