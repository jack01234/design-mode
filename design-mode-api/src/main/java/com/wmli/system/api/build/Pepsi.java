package com.wmli.system.api.build;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 17:34 2018/12/13
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 42.0f;
    }
}
