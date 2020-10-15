package com.system.wmli.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/8/18 21:20
 */
public class DeadLock extends Thread{
    protected Object myDirect;

    static ReentrantLock south = new ReentrantLock();
    static ReentrantLock north = new ReentrantLock();

    public DeadLock(Object obj){
        this.myDirect = obj;
        if (myDirect == south) {
            this.setName("south");
        }
        if (myDirect == north) {
            this.setName("north");
        }
    }

    @Override
    public void run() {
        if (myDirect == south) {
            try {
                north.lockInterruptibly();
                //等待north启动
                Thread.sleep(5000);

                //占用south
                south.lockInterruptibly();

                System.out.println("car to south has pass");
            } catch (InterruptedException e) {
                System.out.println("car to south is kill");
            } finally {
                if (north.isHeldByCurrentThread()) {
                    north.unlock();
                }
                if (south.isHeldByCurrentThread()) {
                    south.unlock();
                }
            }
        }

        if (myDirect == north) {
            try {
                south.lockInterruptibly();

                Thread.sleep(5000);

                north.lockInterruptibly();

                System.out.println("car to north has pass");
            } catch (InterruptedException e) {
                System.out.println("car to north is kill");
            } finally {
                if (north.isHeldByCurrentThread()) {
                    north.unlock();
                }
                if (south.isHeldByCurrentThread()) {
                    south.unlock();
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLock car2South = new DeadLock(south);

        DeadLock car2North = new DeadLock(north);

        car2South.start();

        car2North.start();
    }
}
