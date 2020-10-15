package com.system.wmli.thread;

import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * @author yingmuhuadao
 * @version 1.0.0
 * @date 2020/9/5 20:21
 */
public class ThreadPoolTest {

    public static void main(String[] args) throws InterruptedException {
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,10,60,
//                TimeUnit.SECONDS,new LinkedBlockingDeque<>(), Executors.defaultThreadFactory());
//
//
//        IntStream.range(1,10).forEach(i->{
//            executor.execute(() -> {
//                System.out.println("当前线程数量："+executor.getActiveCount()+", 任务数量："+executor.getTaskCount());
//            });
//        });
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        queue.put("aa");
        System.out.println(queue.take());
        queue.put("bb");

        System.out.println(queue.take());
    }
}
