package com.study.basicdemos.array;

public class NewArray {
    public static void main(String[] args) {
        // 数组大小
        int size = 5;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total); // 总和为： 30.599999999999998
    }
}
