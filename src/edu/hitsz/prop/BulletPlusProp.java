package edu.hitsz.prop;

/**
 * 超级子弹增强道具
 * 大幅增加子弹威力
 * @author hitsz
 */
public class BulletPlusProp extends AbstractProp {

    public BulletPlusProp(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void effect(Object aircraft) {
        System.out.println("FirePlusSupply active!");
    }

}
