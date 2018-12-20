package javadesignbook.abs_and_interface;

import java.util.Scanner;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 16:09 2018/12/14
 */
public class Circle implements IShape {
    public Circle(){

    };
    float r;
    @Override
    public float getArea() {
        return (float) (Math.PI*r*r);
    }

    @Override
    public boolean input() {
        System.out.println("请输入半径");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
        return true;
    }
}
