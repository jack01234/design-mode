package javadesignbook.simple_factory;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 16:09 2018/12/21
 */
public class MidFactory extends AbstractFactory {

    @Override
    public ICar createCar() {
        return new MidCar();
    }

    @Override
    public IBus createBus() {
        return new MidBus();
    }
}
