package com.study.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
    public static void main(String[] args) {
        LinkedList<String> ips = new LinkedList<>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");

        // 获取迭代器
        Iterator<String> it = ips.iterator();
        while (it.hasNext()) {
            String s= it.next();
            System.out.println(s + " ");
        }
    }
}
