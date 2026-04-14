package edu.hitsz.shoot;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;
import edu.hitsz.bullet.HeroBullet;

import java.util.LinkedList;
import java.util.List;

/**
 * 散射策略
 * @author hitsz
 */
public class ScatterShootStrategy implements ShootStrategy {
    @Override
    public List<BaseBullet> shoot(AbstractAircraft aircraft) {
        List<BaseBullet> res = new LinkedList<>();
        int x = aircraft.getLocationX();
        int y = aircraft.getLocationY() + aircraft.getDirection() * 2;
        int power = aircraft.getPower();
        int shootNum = aircraft.getShootNum();

        if (aircraft instanceof HeroAircraft) {
            int speedY = aircraft.getSpeedY() + aircraft.getDirection() * 10;
            for (int i = 0; i < shootNum; i++) {
                int speedX = (int) ((i - (shootNum - 1) / 2.0) * 5);
                res.add(new HeroBullet(x, y, speedX, speedY, power));
            }
        } else {
            int speedY = aircraft.getSpeedY() + 7;
            for (int i = 0; i < shootNum; i++) {
                int speedX = (int) ((i - (shootNum - 1) / 2.0) * 2);
                res.add(new EnemyBullet(x, y, speedX, speedY, power));
            }
        }
        return res;
    }
}
