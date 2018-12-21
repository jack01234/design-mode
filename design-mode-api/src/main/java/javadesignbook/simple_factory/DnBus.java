package javadesignbook.simple_factory;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 15:52 2018/12/21
 */
public class DnBus implements IBus {
    @Override
    public void createBus() {
        System.out.println("dn bus");
    }
}
