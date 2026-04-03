package edu.hitsz.enemy;

import edu.hitsz.aircraft.MobEnemy;

/**
 * 普通敌机工厂
 * 工厂方法模式 - 具体创建者
 * @author hitsz
 */
public class MobEnemyFactory implements EnemyFactory {
    @Override
    public AbstractEnemy createEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        return new MobEnemy(locationX, locationY, speedX, speedY, hp);
    }
}
