package com.study.collection.linkedlist;

import java.util.LinkedList;

public class ExtforDemo {
    public static void main(String[] args) {
        LinkedList<String> ips = new LinkedList<>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");

        for(String s : ips) {
            System.out.println(s + " ");
        }
    }
}
