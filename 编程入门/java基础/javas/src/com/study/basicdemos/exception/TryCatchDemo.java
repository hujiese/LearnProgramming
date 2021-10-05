package com.study.basicdemos.exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        int i = 6;
        try{
            i = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("i = " + i);
    }
}
