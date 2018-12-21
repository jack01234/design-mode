package javadesignbook.simple_factory;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 16:10 2018/12/21
 */
public class DnFactory extends AbstractFactory{
    @Override
    public ICar createCar() {
        return new DnCar();
    }

    @Override
    public IBus createBus() {
        return new DnBus();
    }
}
