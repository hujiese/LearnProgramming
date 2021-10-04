package com.study.multhread.sync;

public class SellTicket1 implements Runnable {
    // 定义100张票
    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            // t1,t2,t3三个线程
            // 这一次的tickets = 1;
            if (tickets > 0) {
                // 为了模拟更真实的场景，这里休眠1s，模拟处理卖票
                try {
                    Thread.sleep(100); //t1进来了并休息，t2进来了并休息，t3进来了并休息，
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + "正在出售第"
                        + (tickets--) + "张票");
                //窗口1正在出售第1张票,tickets=0
                //窗口2正在出售第0张票,tickets=-1
                //窗口3正在出售第-1张票,tickets=-2
            }
        }
    }
}