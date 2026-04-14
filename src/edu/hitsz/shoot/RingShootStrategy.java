package edu.hitsz.shoot;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;
import edu.hitsz.bullet.HeroBullet;

import java.util.LinkedList;
import java.util.List;

/**
 * 环射策略
 * @author hitsz
 */
public class RingShootStrategy implements ShootStrategy {
    @Override
    public List<BaseBullet> shoot(AbstractAircraft aircraft) {
        List<BaseBullet> res = new LinkedList<>();
        int x = aircraft.getLocationX();
        int y = aircraft.getLocationY() + aircraft.getDirection() * 2;
        int power = aircraft.getPower();
        int shootNum = aircraft.getShootNum();
        int speed;

        if (aircraft instanceof HeroAircraft) {
            speed = 10;
            for (int i = 0; i < shootNum; i++) {
                double angle = 2 * Math.PI * i / shootNum;
                int speedX = (int) (speed * Math.cos(angle));
                int speedY = (int) (speed * Math.sin(angle));
                res.add(new HeroBullet(x, y, speedX, speedY, power));
            }
        } else {
            speed = aircraft.getSpeedY() + 8;
            for (int i = 0; i < shootNum; i++) {
                double angle = 2 * Math.PI * i / shootNum;
                int speedX = (int) (speed * Math.cos(angle));
                int speedY = (int) (speed * Math.sin(angle));
                res.add(new EnemyBullet(x, y, speedX, speedY, power));
            }
        }
        return res;
    }
}
