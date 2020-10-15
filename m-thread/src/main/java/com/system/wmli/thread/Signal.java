package com.system.wmli.thread;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/9/4 22:31
 */
public class Signal {
    private static volatile int signal = 0;

    static class ThreadA implements Runnable {

        @Override
        public void run() {
            while (signal < 5) {
                if (signal % 2 == 0) {
                    System.out.println("ThreadA："+signal);
                    synchronized (this) {
                        signal ++;
                    }
                }
            }
        }
    }

    static class ThreadB implements Runnable {

        @Override
        public void run() {
            while (signal < 5){
                if (signal % 2 == 1) {
                    System.out.println("ThreadB："+signal);

                    synchronized (this) {
                        signal ++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new ThreadA()).start();
        Thread.sleep(1000);
        new Thread(new ThreadB()).start();
    }
}
