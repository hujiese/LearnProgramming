package com.study.classes.string;

public class SubstringDemo {
    public static void main(String[] args) {
        String Str = new String("This is text");

        System.out.print("返回值 :" );
        System.out.println(Str.substring(4));

        System.out.print("返回值 :" );
        System.out.println(Str.substring(4, 10));
    }
}
