package javadesignbook.simple_factory;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 17:49 2018/12/20
 */
public class Test {
    public static void main(String[] args) {
        ICar iCar = CarSimpleFactory.create("toptype");
        iCar.createCar();
    }
}
