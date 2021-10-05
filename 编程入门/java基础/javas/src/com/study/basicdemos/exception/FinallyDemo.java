package com.study.basicdemos.exception;

public class FinallyDemo {
    public static void main(String[] args) {
        int i = 6;
        try{
            i = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            i = 10 / 2;
        }

        System.out.println("i = " + i);
    }
}
