package javadesignbook.properties;

import javadesignbook.abs_and_interface.IShape;
import javadesignbook.abs_and_interface.ShapePro;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 14:19 2018/12/20
 */
public class Test {

    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("D:\\myproject\\design-mode\\design-mode-api\\src\\main\\java\\javadesignbook\\properties\\shape.properties"));
            System.out.println(properties);

            String shape = properties.getProperty("shape");
            System.out.println(shape);
            IShape iShape = (IShape) Class.forName(shape).getConstructor().newInstance();
            ShapePro pro = new ShapePro(iShape);
            System.out.println(pro.process());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
