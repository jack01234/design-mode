package com.system.wmli.gc;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/8/20 21:05
 */
public class LocalVarGC {

    public void gc1(){
        byte[] a = new byte[1024*6];
        System.gc();
    }

    public void gc2(){
        byte[] a = new byte[1024*6];
        a = null;
        System.gc();
    }

    public void gc3(){
        {

            byte[] a = new byte[1024*6];
        }

        System.gc();
    }

    public void gc4(){
        {
            byte[] a = new byte[1024*6];
        }
        int c = 10;
        System.gc();
    }

    public static void main(String[] args) throws InterruptedException {
        LocalVarGC localVarGC = new LocalVarGC();
        localVarGC.gc1();
        localVarGC.gc4();
        Thread.sleep(100000);
    }
}
