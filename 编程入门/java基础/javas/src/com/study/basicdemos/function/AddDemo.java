package com.study.basicdemos.function;

public class AddDemo {

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static double add(double a, double b) {
        double c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = add(a, b);
        System.out.println("c = " + c); // c = 3

        double i = 6.6;
        double k = 3.3;
        double s = add(i, k);
        System.out.println("s = " + s); // s = 9.899999999999999
    }
}
