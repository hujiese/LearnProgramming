package com.study.ext.basic;

public class ExtDemo {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.eat();
//        cat.sleep();
//        cat.bark();

        // 测试多态
        Animal animal = new Cat();
        animal.eat();
        animal.sleep();
    }
}
