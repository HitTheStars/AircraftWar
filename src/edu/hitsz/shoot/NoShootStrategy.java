package edu.hitsz.shoot;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.bullet.BaseBullet;
import java.util.LinkedList;
import java.util.List;

/**
 * 不射击策略
 * @author hitsz
 */
public class NoShootStrategy implements ShootStrategy {
    @Override
    public List<BaseBullet> shoot(AbstractAircraft aircraft) {
        return new LinkedList<>();
    }
}
