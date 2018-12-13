package com.wmli.system.api.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 矩形
 *
 * @author: yingmuhuadao
 * @date: Created in 11:27 2018/12/3
 */
@Slf4j
public class Rectangle implements Shape{

    @Override
    public void draw() {
        log.info("Inside Rectangle::draw() method.");
    }
}
