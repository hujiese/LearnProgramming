package com.study.classes.string;

public class SplitDemo {
    public static void main(String[] args) {
        String str = "1934-08-23";
        String[] strs = str.split("-");

        for(String s : strs) {
            System.out.println(s);
        }
    }
}
