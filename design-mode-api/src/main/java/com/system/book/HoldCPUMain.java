package com.system.book;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/7/30 21:22
 */
public class HoldCPUMain {

    public static class HoldCPUTask implements Runnable{

        @Override
        public void run() {
            while (true) {
                //占用CPU
                double v = Math.random() * Math.random();
            }
        }
    }

    public static class LazyTask implements Runnable{

        @Override
        public void run() {
            try {
                while (true) {
                    //空闲线程
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //开启线程占用CPU
        new Thread(new HoldCPUTask()).start();

        new Thread(new LazyTask()).start();

        new Thread(new LazyTask()).start();

        new Thread(new LazyTask()).start();
    }
}
