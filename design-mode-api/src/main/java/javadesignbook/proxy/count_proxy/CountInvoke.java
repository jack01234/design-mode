package javadesignbook.proxy.count_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * 动态代理的执行方法
 *
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/12 13:36
 */
public class CountInvoke implements InvocationHandler {

    private int count = 0;
    //具体主题对象
    private Object obj;

    public CountInvoke(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        count ++;
        method.invoke(obj,args);
        return null;
    }

    int getCount(){
        return count;
    }
}
