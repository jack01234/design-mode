package com.wmli.system.api.build;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 17:34 2018/12/13
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
