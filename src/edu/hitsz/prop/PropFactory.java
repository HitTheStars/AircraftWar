package edu.hitsz.prop;

/**
 * 所有道具的简单工厂
 * @author HitTheStars
 */
public class PropFactory {

    public static AbstractProp getProp(String propName, int locationX, int locationY, int speedX, int speedY) {
        switch (propName) {
            case "BloodProp":
                return new BloodProp(locationX, locationY, speedX, speedY);
            case "BombProp":
                return new BombProp(locationX, locationY, speedX, speedY);
            case "BulletPlusProp":
                return new BulletPlusProp(locationX, locationY, speedX, speedY);
            case "BulletProp":
                return new BulletProp(locationX, locationY, speedX, speedY);
            case "FreezeProp":
                return new FreezeProp(locationX, locationY, speedX, speedY);
            default:
                throw new IllegalArgumentException("Unknown prop name!");
        }
    }

}
