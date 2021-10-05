package com.study.classes.string;

public class StringDemo {
    public static void main(String args[]) {
        char[] helloArray = { 'H', 'e', 'l', 'l', 'o'};
        String helloString = new String(helloArray);
        System.out.println( helloString ); // Hello
    }
}
