package com.study.multhread.sync;

public class SellTicket implements Runnable {

    // 定义100张票
    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            // t1,t2,t3都能走到这里
            // 假设t1抢到CPU的执行权，t1就要进来
            // 假设t2抢到CPU的执行权，t2就要进来,发现门是关着的，进不去。所以就等着。
            // 门(开,关)
            sellTicket();
        }
    }

     private synchronized void sellTicket() {
        if (tickets > 0) {
        try {
                Thread.sleep(100);
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()
                    + "正在出售第" + (tickets--) + "张票 ");
        }
     }
}
