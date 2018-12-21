package javadesignbook.simple_factory;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 17:45 2018/12/20
 */
public class CarSimpleFactory {

    public static final String TOPTYPE = "toptype";
    public static final String MIDTYPE = "midtype";
    public static final String LOWTYPE = "lowtype";

    public static ICar create(String type){
        ICar iCar = null;
        if (TOPTYPE.equals(type)){
            iCar = new UpCar();
        }else if (MIDTYPE.equals(type)) {
            iCar = new MidCar();
        }else if (LOWTYPE.equals(type)) {
            iCar = new DnCar();
        }
        return iCar;
    }
}
