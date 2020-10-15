package com.system.wmli.thread;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/9/5 12:08
 */
public class RetryTest {

    public static void main(String[] args) {
        int count = 0;
        retry:
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 5; j++){
                count++;
                if (count == 3) {
                    continue retry;
                }
                System.out.print(count+" ");
            }
        }
    }
}
