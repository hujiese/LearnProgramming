package com.study.basicdemos.calculate;

public class RelationalDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b)); // a == b = false
        System.out.println("a != b = " + (a != b)); // a != b = true
        System.out.println("a > b = " + (a > b)); // a > b = false
        System.out.println("a < b = " + (a < b)); // a < b = true
        System.out.println("b >= a = " + (b >= a)); // b >= a = true
        System.out.println("b <= a = " + (b <= a)); // b <= a = false
    }
}
