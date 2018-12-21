package javadesignbook.simple_factory;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 16:08 2018/12/21
 */
public class TopFactory extends AbstractFactory {
    @Override
    public ICar createCar() {
        return new UpCar();
    }

    @Override
    public IBus createBus() {
        return new UpBus();
    }
}
