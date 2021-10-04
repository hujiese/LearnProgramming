package com.study.multhread.threadpool;

import java.util.concurrent.Callable;

public class MyCallable2 implements Callable<Integer> {

    private int number;

    public MyCallable2(int number) {
        this.number = number;
    }

    // 计算0到num之间所有数之和
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int x = 1; x <= number; x++) {
            sum += x;
        }
        return sum;
    }
}