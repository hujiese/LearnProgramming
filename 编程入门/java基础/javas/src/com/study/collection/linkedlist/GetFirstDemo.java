package com.study.collection.linkedlist;

import java.util.LinkedList;

public class GetFirstDemo {
    public static void main(String[] args) {
        LinkedList<String> ips = new LinkedList<>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");
        System.out.println("获取表头元素： " + ips.getFirst());
        System.out.println("获取表尾元素： " + ips.getLast());
    }
}
