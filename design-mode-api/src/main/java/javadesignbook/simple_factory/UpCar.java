package javadesignbook.simple_factory;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 14:52 2018/12/20
 */
public class UpCar implements ICar {
    @Override
    public void createCar() {
        System.out.println("up car");
    }
}
