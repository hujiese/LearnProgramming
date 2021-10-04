package com.study.basicdemos.condition;

public class IfelseDemo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // 测试 &&
        if(a == 10 && b == 30) {
            System.out.println("a == 10 && b == 30");
        } else if(a == 10 && b == 20) {
            System.out.println("a == 10 && b == 20");
        } else {
            System.out.println("nothing...");
        }

        // 测试嵌套if
        if(a == 10) {
            if(b == 20) {
                System.out.println("a == 10 && b == 20");
            } else {
                System.out.println("b != 20");
            }
        } else {
            System.out.println("a != 10");
        }

        // 测试 ||
        if(a == 10 || b == 20) {
            System.out.println("a == 10 || b == 30");
        } else {
            System.out.println("a != 10 && b != 30");
        }

        // 测试 !=
        if(a != 30) {
            System.out.println("a != 30");
        }
    }
}
