package edu.hitsz.prop;

import edu.hitsz.basic.AbstractFlyingObject;

/**
 * 所有道具的抽象父类
 * @author hitsz
 */
public abstract class AbstractProp extends AbstractFlyingObject {

    public AbstractProp(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    /**
     * 道具效果生效
     * @param aircraft 生效对象
     */
    public abstract void effect(Object aircraft);

}
