package com.wmli.system.api.shengchengqi;

/**
 * 指挥者类
 */
public class Director {
    Product p;
    public Director(Product p){
        this.p = p;
    }

    void build(){
        p.createUnit1();
        p.createUnit2();
        p.createUnit3();
        p.composite();
    }
}
