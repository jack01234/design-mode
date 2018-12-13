package com.wmli.system.api.build;

import java.util.ArrayList;
import java.util.List;

/**
 * 一顿饭
 *
 * @author: yingmuhuadao
 * @date: Created in 17:38 2018/12/13
 */
public class Meal {
    private List<Item> list = new ArrayList<>();

    public void addItem(Item item){
        list.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item: list){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item:list) {
            System.out.print("Item : "+item.name());
            System.out.print("，packing : "+item.packing().pack());
            System.out.print("，price : "+item.price());
        }
    }
}
