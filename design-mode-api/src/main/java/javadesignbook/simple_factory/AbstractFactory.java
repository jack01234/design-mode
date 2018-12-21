package javadesignbook.simple_factory;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 15:56 2018/12/21
 */
public abstract class AbstractFactory {

    //生产公共小汽车
    public abstract ICar createCar();

    //生产公共汽车对象
    public abstract IBus createBus();

}
