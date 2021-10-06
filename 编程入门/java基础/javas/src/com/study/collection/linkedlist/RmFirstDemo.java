package com.study.collection.linkedlist;

import java.util.LinkedList;

public class RmFirstDemo {
    public static void main(String[] args) {
        LinkedList<String> ips = new LinkedList<>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");
        System.out.println("删除前： " + ips);
        // 删除表头元素
        ips.removeFirst();
        System.out.println("删除后： " + ips);
    }
}
