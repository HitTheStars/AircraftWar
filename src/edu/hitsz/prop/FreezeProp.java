package edu.hitsz.prop;

/**
 * 冰冻道具
 * 冻结所有敌机一段时间
 * @author hitsz
 */
public class FreezeProp extends AbstractProp {

    public FreezeProp(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void effect(Object aircraft) {
        System.out.println("FreezeSupply active!");
        // 冻结所有敌机
    }

}
