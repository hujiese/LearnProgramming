package com.study.basicdemos.loop;

public class ContinueDemo {
    public static void main(String[] args) {
        /* 局部变量定义 */
        int a = 10;

        /* do 循环执行 */
        do {
            if( a == 15) {
                /* 跳过迭代 */
                a = a + 1;
                continue;
            }
            System.out.println("a 的值： " + a);
            a++;

        }while( a < 20 );
    }
}
