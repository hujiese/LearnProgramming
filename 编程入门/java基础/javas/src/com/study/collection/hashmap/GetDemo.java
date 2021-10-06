package com.study.collection.hashmap;

import java.util.HashMap;

public class GetDemo {
    public static void main(String[] args) {
        // 创建 HashMap 对象 ips
        HashMap<Integer, String> ips = new HashMap<Integer, String>();
        // 添加键值对
        ips.put(1, "www.baidu.com");
        ips.put(2, "www.google.com");
        ips.put(3, "www.163.com");
        ips.put(4, "www.qq.com");

        // 获取key为3的值
        String value = ips.get(3);
        System.out.println(value); // www.163.com
    }
}
