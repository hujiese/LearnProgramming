package com.study.basicdemos.loop;

public class ExForDemo {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ){
            System.out.print(x);
            System.out.print(",");
        }
    }
}
