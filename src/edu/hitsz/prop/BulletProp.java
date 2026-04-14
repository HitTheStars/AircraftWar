package edu.hitsz.prop;

import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.shoot.ScatterShootStrategy;

/**
 * 子弹增强道具
 * 将英雄机弹道切换为散射
 * @author hitsz
 */
public class BulletProp extends AbstractProp {

    public BulletProp(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void effect(Object aircraft) {
        System.out.println("FireSupply active!");
        if (aircraft instanceof HeroAircraft) {
            HeroAircraft hero = (HeroAircraft) aircraft;
            hero.setShootStrategy(new ScatterShootStrategy());
            hero.setShootNum(3);
        }
    }

}
