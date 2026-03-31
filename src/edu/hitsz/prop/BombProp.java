package edu.hitsz.prop;

/**
 * 爆炸道具
 * 清除屏幕上所有敌机
 * @author hitsz
 */
public class BombProp extends AbstractProp {

    public BombProp(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void effect(Object aircraft) {
        // 清除所有敌机
    }

}
