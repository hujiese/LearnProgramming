package com.study.basicdemos.function;

public class SwapNumDemo {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        swap(num1, num2);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
