package com.wmli.system.api.build;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 17:32 2018/12/13
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
