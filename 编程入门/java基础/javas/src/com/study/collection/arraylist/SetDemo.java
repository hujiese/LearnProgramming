package com.study.collection.arraylist;

import java.util.ArrayList;

public class SetDemo {
    public static void main(String[] args) {
        ArrayList<String> ips = new ArrayList<>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");
        ips.add("www.qq.com");

        // 修改前
        System.out.println("修改前: " + ips.get(2));
        // 修改索引为2的元素的值
        ips.set(2, "www.666.com");
        // 修改后
        System.out.println("修改后: " + ips.get(2));
    }
}
