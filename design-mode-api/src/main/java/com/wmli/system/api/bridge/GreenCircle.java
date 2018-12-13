package com.wmli.system.api.bridge;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 20:01 2018/12/13
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
