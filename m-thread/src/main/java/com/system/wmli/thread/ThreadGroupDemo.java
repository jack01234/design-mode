package com.system.wmli.thread;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/9/4 21:32
 */
public class ThreadGroupDemo {

    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("group1"){
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t.getName()+ ":" +e.getMessage());
            }
        };

        Thread thread1 = new Thread(threadGroup, new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException();
            }
        });

        thread1.start();
    }
}
