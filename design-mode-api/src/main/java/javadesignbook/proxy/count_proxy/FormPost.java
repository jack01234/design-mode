package javadesignbook.proxy.count_proxy;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/12 13:35
 */
public class FormPost implements IRegist {
    @Override
    public void regist(String str) {
        System.out.println("from Post"+str);
    }
}
