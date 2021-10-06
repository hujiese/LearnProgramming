package com.study.collection.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(1);
        System.out.println("排序前： " + arrayList);

        // 排序
        Collections.sort(arrayList);
        System.out.println("排序后： " + arrayList);
    }
}
