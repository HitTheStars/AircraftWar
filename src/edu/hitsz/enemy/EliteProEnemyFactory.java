package edu.hitsz.enemy;

/**
 * 王牌敌机工厂
 * 工厂方法模式 - 具体创建者
 * @author hitsz
 */
public class EliteProEnemyFactory implements EnemyFactory {
    @Override
    public AbstractEnemy createEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        return new EliteProEnemy(locationX, locationY, speedX, speedY, hp);
    }
}
