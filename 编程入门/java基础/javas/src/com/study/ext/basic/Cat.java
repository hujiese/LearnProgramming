package com.study.ext.basic;

public class Cat extends Animal{

    public Cat() {
        System.out.println("Cat initilize ok ...");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat ...");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep ...");
    }

    public void bark() {
        System.out.println("Cat bark ...");
    }
}
