package edu.hitsz.enemy;

import edu.hitsz.aircraft.AbstractAircraft;

/**
 * 所有敌机的抽象父类
 * @author hitsz
 */
public abstract class AbstractEnemy extends AbstractAircraft {

    public AbstractEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }

}
