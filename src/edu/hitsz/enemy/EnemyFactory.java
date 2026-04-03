package edu.hitsz.enemy;

/**
 * 敌机工厂接口
 * 工厂方法模式 - 创建者角色
 * @author hitsz
 */
public interface EnemyFactory {
    /**
     * 创建敌机
     * @param locationX 初始X坐标
     * @param locationY 初始Y坐标
     * @param speedX X方向速度
     * @param speedY Y方向速度
     * @param hp 生命值
     * @return 创建的敌机实例
     */
    AbstractEnemy createEnemy(int locationX, int locationY, int speedX, int speedY, int hp);
}
