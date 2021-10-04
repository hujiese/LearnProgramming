package com.study.multhread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo {
    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(2);

        //可以执行Runnable对象或者Callable对象代表的线程
        pool.submit(new MyCallable());
        pool.submit(new MyCallable());

        //结束
        pool.shutdown();
    }
}