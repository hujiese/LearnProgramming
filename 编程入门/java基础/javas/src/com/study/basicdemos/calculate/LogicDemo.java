package com.study.basicdemos.calculate;

public class LogicDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b)); // a && b = false
        System.out.println("a || b = " + (a||b)); // a || b = true
        System.out.println("!(a && b) = " + !(a && b)); // !(a && b) = true
    }
}
