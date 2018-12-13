package com.wmli.system.api.decorate;

import com.wmli.system.api.factory.Shape;

/**
 * 抽象装饰类
 *
 * @author: yingmuhuadao
 * @date: Created in 20:36 2018/12/13
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape shape;


    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }
    @Override
    public void draw() {

    }
}
