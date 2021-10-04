package com.study.multhread.threadpool;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            System.out.println(Thread.currentThread().getName() + ":" + x);
        }
    }

}
