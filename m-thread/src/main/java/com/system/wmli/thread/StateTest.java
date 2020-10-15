package com.system.wmli.thread;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/9/4 22:00
 */
public class StateTest {

    public synchronized void testMethod() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        StateTest stateTest = new StateTest();
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                stateTest.testMethod();
            }
        });

        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                stateTest.testMethod();
            }
        });

        a.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        b.start();

        System.out.println(a.getName() + ":" + a.getState()); // 输出？
        System.out.println(b.getName() + ":" + b.getState()); // 输出？

    }

}
