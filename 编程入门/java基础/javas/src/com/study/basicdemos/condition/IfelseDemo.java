package com.study.basicdemos.condition;

public class IfelseDemo {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        if( a == b ) {
            System.out.println("a 等于 b");
        } else {
            System.out.println("a 不等于 b" );
        }

        if ( a < b ) {
            System.out.println("a 小于 b" );
        } else {
            System.out.println("a 不小于 b" );
        }

        if ( a > b ) {
            System.out.println("a 大于 b" );
        } else {
            System.out.println("a 不大于 b" );
        }

        /* 改变 a 和 b 的值 */
        a = 5;
        b = 20;
        if ( a <= b ) {
            System.out.println("a 小于或等于 b" );
        }

        if ( b >= a ) {
            System.out.println("b 大于或等于 a" );
        }
    }
}
