package com.study.classes.string;

public class ConcatDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";
        String str3 = str1.concat(str2);
        String str4 = str1 + str2;

        System.out.println(str3); // Hello World
        System.out.println(str4); // Hello World
    }
}
