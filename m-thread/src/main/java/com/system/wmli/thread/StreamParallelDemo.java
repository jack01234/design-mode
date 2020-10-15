package com.system.wmli.thread;

import java.util.stream.Stream;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/9/6 10:07
 */
public class StreamParallelDemo {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).parallel()
                .reduce((a,b)->{
                    System.out.println(String.format("%s: %d + %d = %d",
                            Thread.currentThread().getName(), a, b, a + b));
                    return a + b;
                }).ifPresent(System.out::println);
    }
}
