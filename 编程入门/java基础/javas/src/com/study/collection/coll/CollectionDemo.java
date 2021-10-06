package com.study.collection.coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        // 创建一个数组集合
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(4);

        // for增强遍历该集合
        for(Integer i : list) {
            System.out.print(i + " ");
        }
        // 为了方便观察，换行
        System.out.println();

        // 调用Collections的sort方法对数组集合排序
        Collections.sort(list);

        // 使用迭代器方式遍历集合
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.print(i + " ");
        }
    }
}
