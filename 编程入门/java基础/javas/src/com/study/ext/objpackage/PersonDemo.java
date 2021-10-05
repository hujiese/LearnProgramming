package com.study.ext.objpackage;

public class PersonDemo {
    public static void main(String args[]){
        Person person = new Person("Jack", 25);
        System.out.println(person);

        // 修改名字和年龄
        person.setName("James");
        person.setAge(20);

        System.out.print("Name : " + person.getName()+
                " Age : "+ person.getAge());
    }
}
