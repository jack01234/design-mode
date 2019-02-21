package com.wmli.system.api.shengchengqi;

/**
 * 具体的生成器
 */
public class BuildProduct extends Product {

    @Override
    void createUnit1() {
        System.out.println("u1");
    }

    @Override
    void createUnit2() {
        System.out.println("u2");

    }

    @Override
    void createUnit3() {
        System.out.println("u3");
    }

    @Override
    void composite() {
        System.out.println("u1,u2,u3");
    }
}
