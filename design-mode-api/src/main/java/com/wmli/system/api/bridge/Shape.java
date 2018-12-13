package com.wmli.system.api.bridge;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 20:01 2018/12/13
 */
public abstract class Shape {

    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
