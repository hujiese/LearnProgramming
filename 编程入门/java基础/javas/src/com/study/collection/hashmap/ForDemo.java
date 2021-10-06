package com.study.collection.hashmap;

import java.util.HashMap;

public class ForDemo {
    public static void main(String[] args) {
        // 创建 HashMap 对象 ips
        HashMap<Integer, String> ips = new HashMap<Integer, String>();
        // 添加键值对
        ips.put(1, "www.baidu.com");
        ips.put(2, "www.google.com");
        ips.put(3, "www.163.com");
        ips.put(4, "www.qq.com");

        // 输出 key 和 value
        System.out.println("输出所有key-value：");
        for (Integer i : ips.keySet()) {
            System.out.println("key: " + i + " value: " + ips.get(i));
        }
        System.out.println("输出所有value：");
        // 返回所有 value 值
        for(String value: ips.values()) {
            // 输出每一个value
            System.out.println(value);
        }
    }
}
