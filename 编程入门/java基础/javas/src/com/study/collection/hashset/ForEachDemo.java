package com.study.collection.hashset;

import java.util.HashSet;

public class ForEachDemo {
    public static void main(String[] args) {
        HashSet<String> ips = new HashSet<String>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");
        ips.add("www.qq.com");

        for(String s:ips) {
            System.out.println(s);
        }
    }
}
