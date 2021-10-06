package com.study.collection.linkedlist;

import java.util.LinkedList;

public class SizeDemo {
    public static void main(String[] args) {
        LinkedList<String> ips = new LinkedList<>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");
        System.out.println("集合中元素个数为： " + ips.size()); // 集合中元素个数为： 3
    }
}
