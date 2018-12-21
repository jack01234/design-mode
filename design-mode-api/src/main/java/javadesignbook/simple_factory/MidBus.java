package javadesignbook.simple_factory;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 15:51 2018/12/21
 */
public class MidBus implements IBus {
    @Override
    public void createBus() {
        System.out.println("mid bus");
    }
}
