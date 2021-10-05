package com.study.ext.inter;


public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("Dog eat..");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep...");
    }

    @Override
    public void bark() {
        System.out.println("Wang Wang Wang ...");
    }
}
