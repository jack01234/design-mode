package com.wmli.system.api.abstractfactory;

import com.wmli.system.api.factory.Shape;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 15:30 2018/12/6
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return null;
        }
        return null;
    }

    public static void main(String[] args) {
        AbstractFactory shape = FactoryProducer.getFactory("SHAPE");
        Shape rectangle = shape.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = shape.getShape("SQUARE");
        square.draw();
    }
}
