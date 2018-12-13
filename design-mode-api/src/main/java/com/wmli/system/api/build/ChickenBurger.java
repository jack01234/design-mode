package com.wmli.system.api.build;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 17:33 2018/12/13
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 32.0f;
    }
}
