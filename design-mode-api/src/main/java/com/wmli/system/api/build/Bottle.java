package com.wmli.system.api.build;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 17:26 2018/12/13
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
