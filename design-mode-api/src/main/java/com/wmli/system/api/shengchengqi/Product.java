package com.wmli.system.api.shengchengqi;

import com.system.design.common.model.Unit1;
import com.system.design.common.model.Unit2;
import com.system.design.common.model.Unit3;

/**
 * 抽象生成器
 */
public abstract class Product {
    Unit1 u1;
    Unit2 u2;
    Unit3 u3;
    //创建U1
    abstract void createUnit1();
    //创建U2
    abstract void createUnit2();
    //创建U3
    abstract void createUnit3();
    //组合子类
    abstract void composite();
}
