package com.study.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> ips = new ArrayList<>();
        ips.add("www.baidu.com");
        ips.add("www.google.com");
        ips.add("www.163.com");
        ips.add("www.qq.com");

        // 获取迭代器
        Iterator<String> it = ips.iterator();
        // 遍历迭代器
        while(it.hasNext()) {
            String s = it.next();
            System.out.print(s + " ");
        }
    }
}
