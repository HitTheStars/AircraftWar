package edu.hitsz.prop;

/**
 * 血液道具
 * 恢复英雄机生命值
 * @author hitsz
 */
public class BloodProp extends AbstractProp {

    public BloodProp(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void effect(Object aircraft) {
        // 恢复30点生命值
    }

}
