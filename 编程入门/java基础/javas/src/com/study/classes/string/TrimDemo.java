package com.study.classes.string;

public class TrimDemo {
    public static void main(String[] args) {
        String str = "    Hello   ";
        System.out.println("trim前： " + str);

        str = str.trim();
        System.out.println("trim后： " + str);
    }
}
