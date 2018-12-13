package com.wmli.system.api.singleton;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 17:31 2018/12/6
 */
public class SingleObject {

    //创建 SingleObject 的一个对象
    private static SingleObject instance;

    private static class SingletonHolder {
        private static final SingleObject INSTANCE = new SingleObject();
    }
    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}


    //获取唯一可用的对象:lasy
    public static SingleObject getInstance(){
        if (null == instance) {
            return new SingleObject();
        }
        return instance;
    }

    //双检锁/双重校验锁（DCL，即 double-checked locking）

    public static SingleObject getInstance1(){
        if (null == instance) {
            synchronized (SingleObject.class){
                if (null == instance) {
                    instance = new SingleObject();
                }
            }
        }
        return instance;
    }

    public static final SingleObject getInstance2() {
        return SingletonHolder.INSTANCE;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
