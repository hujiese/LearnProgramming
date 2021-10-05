package com.study.classes.date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("时间戳： " + date.getTime());
        System.out.println("字符串： " + date.toString());
    }
}
