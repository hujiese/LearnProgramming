package com.study.multhread.lock;

public class SellTicketDemo {
    public static void main(String[] args) {
        // 创建资源对象
        SellTicket st = new SellTicket();

        // 创建三个窗口
        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        // 启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}