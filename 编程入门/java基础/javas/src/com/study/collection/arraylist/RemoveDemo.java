package com.study.collection.arraylist;

import java.util.ArrayList;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> ips = new ArrayList<>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");
        ips.add("www.qq.com");

        // 删除前
        System.out.println("删除前: " + ips);
        // 删除索引为2的元素的值
        ips.remove(2);
        // 删除后
        System.out.println("删除后: " + ips);
    }
}
