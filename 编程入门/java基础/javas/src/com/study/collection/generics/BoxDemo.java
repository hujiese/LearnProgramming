package com.study.collection.generics;

public class BoxDemo {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("hello"));

        System.out.println("整型值为 : " + integerBox.get()); // 整型值为 : 10
        System.out.println("字符串为 : " + stringBox.get()); // 字符串为 : hello
    }
}
