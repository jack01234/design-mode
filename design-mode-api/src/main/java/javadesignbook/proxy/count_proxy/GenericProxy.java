package javadesignbook.proxy.count_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 *
 * 动态代理类
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/12 13:46
 */
public class GenericProxy {
    public static Object createProxy(Object obj, InvocationHandler handler){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
    }
}
