package com.wmli.system.api.abstractfactory;

import com.wmli.system.api.factory.Rectangle;
import com.wmli.system.api.factory.Shape;
import com.wmli.system.api.factory.Square;
import org.apache.commons.lang3.StringUtils;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 15:26 2018/12/6
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if (StringUtils.isBlank(shape)){
            return null;
        }
        if ("RECTANGLE".equalsIgnoreCase(shape)) {
            return new Rectangle();
        }else if ("SQUARE".equalsIgnoreCase(shape)) {
            return new Square();
        }else {
            return null;
        }
    }
}
