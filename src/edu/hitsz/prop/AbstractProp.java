package edu.hitsz.prop;

import edu.hitsz.basic.AbstractFlyingObject;

/**
 * 道具抽象类
 * 继承可飞行对象并实现道具效果接口
 * @author hitsz
 */
public abstract class AbstractProp extends AbstractFlyingObject implements PropProduct {

    public AbstractProp(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

}
