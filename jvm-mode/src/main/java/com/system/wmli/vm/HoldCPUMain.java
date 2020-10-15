package com.system.wmli.vm;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/8/13 20:57
 */
public class HoldCPUMain {
    public static class HoldCPUTask implements Runnable{

        @Override
        public void run() {
            while (true) {
                double v = Math.random() * Math.random();
            }
        }
    }

    public static class LazyTask implements Runnable{

        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {

        String s = Integer.toHexString(2856);
        System.out.println(s);
        System.out.println(">>>>>>>>>开始<<<<<<<<");
        new Thread(new HoldCPUTask()).start();
        new Thread(new LazyTask()).start();
        new Thread(new LazyTask()).start();
        new Thread(new LazyTask()).start();
        System.out.println(">>>>>>>>>结束<<<<<<<<");
    }
}
