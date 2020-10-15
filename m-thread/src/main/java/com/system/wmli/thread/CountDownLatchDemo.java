package com.system.wmli.thread;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/9/6 9:19
 */
public class CountDownLatchDemo {

    static class PreTaskThread extends Thread {
        private String task;
        private CountDownLatch countDownLatch;

        public PreTaskThread (String task, CountDownLatch countDownLatch){
            this.task = task;
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            try {
                Random random = new Random();
                Thread.sleep(random.nextInt(1000));
                System.out.println(task+"-任务完成");
                countDownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        //主任务
        new Thread(()->{
            try {
                System.out.println("等待数据加载……");
                System.out.println(String.format("还有%d个前置任务", countDownLatch.getCount()));
                countDownLatch.await();
                System.out.println("数据加载完成，正式开始游戏！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // 前置任务
        new Thread(new PreTaskThread("加载地图数据", countDownLatch)).start();
        new Thread(new PreTaskThread("加载人物模型", countDownLatch)).start();
        new Thread(new PreTaskThread("加载背景音乐", countDownLatch)).start();
    }
}
