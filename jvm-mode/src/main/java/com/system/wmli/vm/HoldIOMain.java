package com.system.wmli.vm;

import javax.swing.plaf.PanelUI;
import java.io.*;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/8/17 21:24
 */
public class HoldIOMain {
    public static class HoldIOTask implements Runnable{

        @Override
        public void run() {
            while (true) {
                try {
                    FileOutputStream fos = new FileOutputStream(new File("temp"));
                    for (int i=0; i<10000; i++) {
                        fos.write(i);
                    }
                    //大量的读操作
                    FileInputStream fis = new FileInputStream(new File("temp"));
                    while (fis.read() != -1);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class LazyTask implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(Integer.toHexString(6450));
        new Thread(new HoldIOTask()).start();
        new Thread(new LazyTask()).start();
        new Thread(new LazyTask()).start();
        new Thread(new LazyTask()).start();
    }
}
