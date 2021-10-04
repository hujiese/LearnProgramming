package com.study.multhread.threadpool;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
        // 创建定时器对象
        Timer t = new Timer();
        // 3秒后执行爆炸任务
        // t.schedule(new MyTask(), 3000);
        //结束任务
        t.schedule(new MyTask(t), 3000);
    }
}

// 做一个任务
class MyTask extends TimerTask {

    private Timer t;

    public MyTask(){}

    public MyTask(Timer t){
        this.t = t;
    }

    @Override
    public void run() {
        System.out.println("beng,爆炸了");
        t.cancel();
    }

}
