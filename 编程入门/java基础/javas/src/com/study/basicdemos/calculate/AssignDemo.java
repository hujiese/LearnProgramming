package com.study.basicdemos.calculate;

public class AssignDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c ); // c = a + b = 30
        c += a ;
        System.out.println("c += a  = " + c ); // c += a  = 40
        c -= a ;
        System.out.println("c -= a = " + c ); // c -= a = 30
        c *= a ;
        System.out.println("c *= a = " + c ); // c *= a = 300
        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c ); // c /= a = 1
        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c ); // c %= a  = 5
        c <<= 2 ;
        System.out.println("c <<= 2 = " + c ); // c <<= 2 = 20
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c ); // c >>= 2 = 5
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c ); // c >>= 2 = 1
        c &= a ;
        System.out.println("c &= a  = " + c ); // c &= a  = 0
        c ^= a ;
        System.out.println("c ^= a   = " + c ); // c ^= a   = 10
        c |= a ;
        System.out.println("c |= a   = " + c ); // c |= a   = 10
    }
}
