package com.study.basicdemos.function;

public class SwapStrDemo {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("world");
        swap(str1, str2);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

    public static void swap(String str1, String str2) {
        String temp = str1;
        str1 = str2;
        str2 = temp;
    }
}
