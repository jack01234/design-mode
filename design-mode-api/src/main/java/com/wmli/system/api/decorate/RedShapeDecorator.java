package com.wmli.system.api.decorate;

import com.wmli.system.api.factory.Rectangle;
import com.wmli.system.api.factory.Shape;
import com.wmli.system.api.factory.Square;

/**
 * 红色装饰类
 *
 * @author: yingmuhuadao
 * @date: Created in 20:38 2018/12/13
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }

    public static void main(String[] args) {
        Shape shape = new Square();

        Shape redSquare = new RedShapeDecorator(new Square());


        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        redSquare.draw();

        System.out.println("Rectangle of red border");
        redRectangle.draw();

    }
}
