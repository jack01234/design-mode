package javadesignbook.simple_factory;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 15:50 2018/12/21
 */
public class UpBus implements IBus {
    @Override
    public void createBus() {
        System.out.println("up bus");
    }
}
