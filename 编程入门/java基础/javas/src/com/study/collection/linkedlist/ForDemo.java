package com.study.collection.linkedlist;

import java.util.LinkedList;

public class ForDemo {
    public static void main(String[] args) {
        LinkedList<String> ips = new LinkedList<>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");

        for(int i = 0; i < ips.size(); ++i) {
            System.out.println(ips.get(i) + " ");
        }
    }
}
