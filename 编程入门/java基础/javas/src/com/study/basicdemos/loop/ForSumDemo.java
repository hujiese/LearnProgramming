package com.study.basicdemos.loop;

public class ForSumDemo {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for(i = 1; i <= 100; ++i) {
            sum += i; // sum = sum + i;
        }
        System.out.println("sum = " + sum); // sum = 5050
    }
}
