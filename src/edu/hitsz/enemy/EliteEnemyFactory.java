package edu.hitsz.enemy;

/**
 * 精英敌机工厂
 * 工厂方法模式 - 具体创建者
 * @author hitsz
 */
public class EliteEnemyFactory implements EnemyFactory {
    @Override
    public AbstractEnemy createEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        return new EliteEnemy(locationX, locationY, speedX, speedY, hp);
    }
}
