package com.study.ext.inter;

public class InterfaceDemo {
    public static void main(String[] args) {
//        Animal animal = new Dog();
//        animal.sleep();
//        animal.eat();
//        animal.bark();
//
//        Dog dog = new Dog();
//        dog.sleep();
//        dog.eat();
//        dog.bark();
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("Animal eat...");
            }

            @Override
            public void sleep() {
                System.out.println("Animal sleep...");
            }

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
