package edu.hitsz.prop;

/**
 * 爆炸道具
 * @author hitsz
 */
public class BombProp extends AbstractProp {

    public BombProp(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void effect(Object aircraft) {
        System.out.println("BombSupply active!");
    }

}
