package com.study.basicdemos.calculate;

public class BasicCalculate {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        int e = 25;

        System.out.println("a + b = " + (a + b)); // a + b = 30
        System.out.println("a - b = " + (a - b)); // a - b = -10
        System.out.println("a * b = " + (a * b)); // a * b = 200
        System.out.println("b / a = " + (b / a)); // b / a = 2
        System.out.println("b % a = " + (b % a)); // b % a = 0
        System.out.println("c % a = " + (c % a)); // c % a = 5
        System.out.println("a++   = " +  (a++));  // a++   = 10
        System.out.println("a--   = " +  (a--));  // a--   = 11
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++));  // d++   = 25
        System.out.println("++d   = " +  (++e));  // ++d   = 26
    }
}
