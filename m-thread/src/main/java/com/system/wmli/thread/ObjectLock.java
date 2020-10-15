package com.system.wmli.thread;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/9/4 22:16
 */
public class ObjectLock {
    private static Object lock = new Object();

    static class ThreadA implements Runnable{

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("Thread A " + i);
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        }
    }

    static class ThreadB implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("Thread B " + i);
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new ThreadA());

        Thread b = new Thread(new ThreadB());

        a.start();

        Thread.sleep(1000);

        b.start();
    }
}
