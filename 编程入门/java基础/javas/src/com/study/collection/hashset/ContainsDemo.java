package com.study.collection.hashset;

import java.util.HashSet;

public class ContainsDemo {
    public static void main(String[] args) {
        HashSet<String> ips = new HashSet<String>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");
        ips.add("www.qq.com");
        System.out.println(ips.contains("www.google.com")); // true
    }
}
