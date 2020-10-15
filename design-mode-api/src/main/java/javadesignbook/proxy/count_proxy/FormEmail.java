package javadesignbook.proxy.count_proxy;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/12 11:26
 */
public class FormEmail implements IRegist{
    @Override
    public void regist(String str) {
        System.out.println("from Email"+str);
    }
}

