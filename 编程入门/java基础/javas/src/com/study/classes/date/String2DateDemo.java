package com.study.classes.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String2DateDemo {
    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");

        String input = "2021-10-05 07:22:32";

        Date t;

        try {
            t = ft.parse(input);
            System.out.println(t.getTime()); // 1633389752000
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
    }
}
