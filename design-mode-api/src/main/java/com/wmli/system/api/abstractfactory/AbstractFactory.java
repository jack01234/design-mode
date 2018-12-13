package com.wmli.system.api.abstractfactory;

import com.wmli.system.api.factory.Shape;


/**
 * 抽象工厂类
 *
 * @author: yingmuhuadao
 * @date: Created in 13:35 2018/12/3
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shape) ;
}
