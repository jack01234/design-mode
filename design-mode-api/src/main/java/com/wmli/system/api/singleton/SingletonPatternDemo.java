package com.wmli.system.api.singleton;

/**
 * pc 端 api
 *
 * @author: yingmuhuadao
 * @date: Created in 17:37 2018/12/6
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
