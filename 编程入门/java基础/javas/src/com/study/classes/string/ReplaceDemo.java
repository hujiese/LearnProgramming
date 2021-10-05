package com.study.classes.string;

public class ReplaceDemo {
    public static void main(String[] args) {
        String str = "123455556789";
        String result = str.replace("5", "x");
        System.out.println(result); // 1234xxxx6789
    }
}
