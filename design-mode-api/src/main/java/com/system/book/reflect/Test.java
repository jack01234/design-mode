package com.system.book.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/6/4 15:40
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class<?> a = Class.forName("com.system.book.reflect.A");

        //获得类的构造函数
        Constructor<?>[] constructors = a.getConstructors();
        for (int i=0;i<constructors.length;i++) {
            System.out.println(constructors[i].toString());
        }

        Object o = constructors[0].newInstance("1");
        //获取类的所有变量
        System.out.println("类A的方法如下所示：");
        Method[] declaredMethods = a.getDeclaredMethods();
        for (int i=0;i<declaredMethods.length;i++) {
            System.out.println(declaredMethods[i].toString());
        }

        Constructor<?> constructor = a.getConstructor();
        Object o1 = constructor.newInstance();

        Constructor<?> constructor1 = a.getConstructor(Integer.class, String.class);
        constructor1.newInstance(2020,"Hello");

        Method func1 = a.getMethod("func1", Integer.class);
        func1.invoke(o1,102);

        Method func2 = a.getMethod("func2", String.class);
        func2.invoke(o1,"hello world");
    }
}
