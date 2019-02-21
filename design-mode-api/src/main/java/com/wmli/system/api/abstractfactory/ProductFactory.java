package com.wmli.system.api.abstractfactory;

import javadesignbook.simple_factory.IRead;

/**
 * 泛型抽象类
 */
public class ProductFactory<T> {

    //className 是某产品具体类名，非工厂类名
    static IRead create(String className){
        IRead product = null;
        try {
            Class<?> c = Class.forName(className);
            product = (IRead) c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }
}
