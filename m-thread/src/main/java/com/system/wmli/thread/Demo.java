package com.system.wmli.thread;

import java.util.stream.IntStream;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/9/4 21:26
 */
public class Demo {

    public static class T1 extends Thread {

        @Override
        public void run() {
            super.run();
            System.out.println(String.format("当前执行的线程是：%s，优先级：%d", Thread.currentThread().getName(),
                    Thread.currentThread().getPriority()));
        }
    }

    public static void main(String[] args) {
        IntStream.range(1,10).forEach(i->{
            Thread thread = new Thread(new T1());
            thread.setPriority(i);
            thread.start();
        });
    }
}
