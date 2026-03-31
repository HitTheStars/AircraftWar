package edu.hitsz.prop;

/**
 * 子弹增强道具
 * 增加子弹威力
 * @author hitsz
 */
public class BulletProp extends AbstractProp {

    public BulletProp(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void effect(Object aircraft) {
        System.out.println("FireSupply active!");
    }

}
