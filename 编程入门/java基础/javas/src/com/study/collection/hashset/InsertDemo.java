package com.study.collection.hashset;

import java.util.HashSet;

public class InsertDemo {
    public static void main(String[] args) {
        HashSet<String> ips = new HashSet<String>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");
        ips.add("www.qq.com");
        ips.add("www.qq.com");  // 重复的元素不会被添加
        System.out.println(ips);
    }
}
