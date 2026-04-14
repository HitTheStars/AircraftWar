package edu.hitsz.shoot;

import edu.hitsz.aircraft.AbstractAircraft;
import edu.hitsz.aircraft.HeroAircraft;
import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;
import edu.hitsz.bullet.HeroBullet;
import edu.hitsz.enemy.BossEnemy;
import edu.hitsz.enemy.EliteEnemy;
import edu.hitsz.enemy.ElitePlusEnemy;
import edu.hitsz.enemy.EliteProEnemy;

import java.util.LinkedList;
import java.util.List;

/**
 * 直射策略
 * @author hitsz
 */
public class DirectShootStrategy implements ShootStrategy {
    @Override
    public List<BaseBullet> shoot(AbstractAircraft aircraft) {
        List<BaseBullet> res = new LinkedList<>();
        int x = aircraft.getLocationX();
        int y = aircraft.getLocationY() + aircraft.getDirection() * 2;
        int speedX = 0;
        int power = aircraft.getPower();
        int shootNum = aircraft.getShootNum();

        if (aircraft instanceof HeroAircraft) {
            int speedY = aircraft.getSpeedY() + aircraft.getDirection() * 10;
            for (int i = 0; i < shootNum; i++) {
                int bx = x + (i * 2 - shootNum + 1) * 10;
                res.add(new HeroBullet(bx, y, speedX, speedY, power));
            }
        } else {
            int speedY;
            if (aircraft instanceof EliteProEnemy) {
                speedY = aircraft.getSpeedY() + 6;
            } else if (aircraft instanceof ElitePlusEnemy) {
                speedY = aircraft.getSpeedY() + 7;
            } else if (aircraft instanceof BossEnemy) {
                speedY = aircraft.getSpeedY() + 8;
            } else {
                // EliteEnemy default
                speedY = aircraft.getSpeedY() + 5;
            }
            for (int i = 0; i < shootNum; i++) {
                int bx = x + (i * 2 - shootNum + 1) * 10;
                res.add(new EnemyBullet(bx, y, speedX, speedY, power));
            }
        }
        return res;
    }
}
