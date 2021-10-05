package com.study.ext.absclass;

public class AbsClassDemo {
    public static void main(String[] args) {
//        Animal animal = new Dog();
//        animal.eat();
//        animal.sleep();
//        animal.bark();
        Animal animal = new Animal() {
            @Override
            public void bark() {
                System.out.println("Animal bark...");
            }
        };
        animal.eat();
        animal.sleep();
        animal.bark();
    }
}
