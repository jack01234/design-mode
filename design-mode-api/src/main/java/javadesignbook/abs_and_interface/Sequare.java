package javadesignbook.abs_and_interface;

import java.util.Scanner;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 16:18 2018/12/14
 */
public class Sequare implements IShape {
    public Sequare(){

    }
    float x;
    float y;
    @Override
    public float getArea() {
        return x*y;
    }

    @Override
    public boolean input() {
        System.out.println("请输入长、宽");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextFloat();
        y = scanner.nextFloat();
        return true;
    }
}
