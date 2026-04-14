package edu.hitsz.prop;

import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.shoot.RingShootStrategy;

/**
 * 超级子弹增强道具
 * 将英雄机弹道切换为环射
 * @author hitsz
 */
public class BulletPlusProp extends AbstractProp {

    public BulletPlusProp(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void effect(Object aircraft) {
        System.out.println("FirePlusSupply active!");
        if (aircraft instanceof HeroAircraft) {
            HeroAircraft hero = (HeroAircraft) aircraft;
            hero.setShootStrategy(new RingShootStrategy());
            hero.setShootNum(20);
        }
    }

}
