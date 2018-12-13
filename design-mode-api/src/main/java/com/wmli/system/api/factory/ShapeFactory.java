package com.wmli.system.api.factory;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * 形状工厂类
 *
 * @author: yingmuhuadao
 * @date: Created in 11:31 2018/12/3
 */
@Slf4j
public class ShapeFactory {

    public Shape getShape (String shapeType) {
        if (StringUtils.isBlank(shapeType)) {
            return null;
        }
        if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        }else if ("SQUARE".equalsIgnoreCase(shapeType)) {
            return new Square();
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = factory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = factory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
