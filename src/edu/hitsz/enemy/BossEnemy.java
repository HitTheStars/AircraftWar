package edu.hitsz.enemy;

import edu.hitsz.application.Main;
import edu.hitsz.shoot.RingShootStrategy;

/**
 * Boss敌机
 * 高生命值、环射攻击、必定掉落道具
 * @author hitsz
 */
public class BossEnemy extends AbstractEnemy {

    public BossEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
        this.shootNum = 20;
        this.power = 60;
        this.direction = 1;
        this.shootStrategy = new RingShootStrategy();
    }

    @Override
    public void forward() {
        super.forward();
        if (locationY >= Main.WINDOW_HEIGHT) {
            vanish();
        }
    }

}
