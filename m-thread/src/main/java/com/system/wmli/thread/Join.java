package com.system.wmli.thread;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/9/4 23:07
 */
public class Join {
    static class ThreadA implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println("我是子线程，我先睡一秒");
                Thread.sleep(1000);
                System.out.println("我是子线程，我睡了一秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadA());
        thread.start();

        thread.join();
        System.out.println("如果不加join的话，我会先被打印出来，加了就不一样了");

    }
}
