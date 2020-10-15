package com.system.wmli.thread;

import java.util.concurrent.*;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/9/4 21:09
 */
public class Task implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        return 2;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Task task = new Task();

        Future<Integer> submit = executorService.submit(task);

        System.out.println(submit.get(5, TimeUnit.SECONDS));


    }
}
