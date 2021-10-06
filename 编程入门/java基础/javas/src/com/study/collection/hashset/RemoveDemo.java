package com.study.collection.hashset;

import java.util.HashSet;

public class RemoveDemo {
    public static void main(String[] args) {
        HashSet<String> ips = new HashSet<String>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");
        ips.add("www.qq.com");
        System.out.println("删除前: " + ips);

        // 删除一个元素
        ips.remove("www.163.com");
        System.out.println("删除后: " + ips);
    }
}
