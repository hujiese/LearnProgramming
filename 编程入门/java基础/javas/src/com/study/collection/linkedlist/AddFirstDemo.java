package com.study.collection.linkedlist;

import java.util.LinkedList;

public class AddFirstDemo {
    public static void main(String[] args) {
        LinkedList<String> ips = new LinkedList<>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");
        System.out.println("添加前： " + ips);
        // 表头添加元素
        ips.addFirst("www.qq.com");
        System.out.println("添加后： " + ips);
    }
}
