package com.study.basicdemos.loop;

public class BreakDemo {
    public static void main(String[] args) {
        /* 局部变量定义 */
        int a = 10;

        /* do 循环执行 */
        do {
            if( a == 15) {
                /* 跳出循环 */
                a = a + 1;
                break;
            }
            System.out.println("a 的值：" + a);
            a++;

        }while( a < 20 );
    }
}
