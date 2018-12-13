package com.wmli.system.api.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 正方形
 *
 * @author: yingmuhuadao
 * @date: Created in 11:30 2018/12/3
 */
@Slf4j
public class Square implements Shape{

    @Override
    public void draw() {
        log.info("Inside Square::draw() method.");
    }
}
