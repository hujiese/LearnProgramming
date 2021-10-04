package com.study.basicdemos.array;

public class MatrixDemo {
    public static void main(String[] args) {
        int[][] a = {
            {0, 1, 2, 3} ,   /*  初始化索引号为 0 的行 */
            {4, 5, 6, 7} ,   /*  初始化索引号为 1 的行 */
            {8, 9, 10, 11}   /*  初始化索引号为 2 的行 */
        };
        // 获取二维数组元素
        System.out.println("a[0][0] = " + a[0][0] + " , a[2][3] = " + a[2][3]); // a[0][0] = 0 , a[2][3] = 11
        // 二维数组赋值
        a[0][0] = 6;
        a[2][3] = 66;
        System.out.println("a[0][0] = " + a[0][0] + " , a[2][3] = " + a[2][3]); // a[0][0] = 6 , a[2][3] = 66
    }
}
