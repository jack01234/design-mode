package com.wmli.system.api.build;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 17:27 2018/12/13
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {return new Wrapper();

    }

    @Override
    public abstract float price();
}
