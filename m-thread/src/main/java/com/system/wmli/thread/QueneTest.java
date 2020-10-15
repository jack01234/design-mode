package com.system.wmli.thread;

import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/9/5 21:33
 */
public class QueneTest {
    private int queueSize = 10;

    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(queueSize);

    public static void main(String[] args) {
            QueneTest test = new QueneTest();
            Producer producer = test.new Producer();
            Consumer consumer = test.new Consumer();

            producer.start();

            consumer.start();
    }

    class Consumer extends Thread {

        @Override
        public void run() {
            consume();
        }

        private void consume(){
            while (true) {
                try {
                    queue.take();
                    System.out.println("从队列取走一个元素，队列剩余"+queue.size()+"个元素");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Producer extends Thread {

        @Override
        public void run() {
            produce();
        }
        private void produce(){
            while (true) {
                try {
                    queue.put(1);
                    System.out.println("向队列取中插入一个元素，队列剩余空间："+(queueSize-queue.size()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
