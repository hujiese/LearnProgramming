package com.study.collection.arraylist;

import java.util.ArrayList;

public class SizeDemo {
    public static void main(String[] args) {
        ArrayList<String> ips = new ArrayList<>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");
        ips.add("www.qq.com");

        System.out.println("元素个数为： " + ips.size()); // 元素个数为： 4
    }
}
