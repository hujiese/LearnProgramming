package com.study.collection.arraylist;

import java.util.ArrayList;

public class ForDemo {
    public static void main(String[] args) {
        ArrayList<String> ips = new ArrayList<>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");
        ips.add("www.qq.com");

        for(int i = 0; i < ips.size(); ++i) {
            System.out.print(ips.get(i) + " ");
        }
    }
}
