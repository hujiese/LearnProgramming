package com.study.oob;

public class MyDogDemo {
    public static void main(String[] args) {
        MyDog myDog = new MyDog("哈士奇", "淘气包", true);
        System.out.println("品种是：" + myDog.getBreed());
        System.out.println("名字是：" + myDog.getName());
        // 修改名字
        myDog.setName("旺财");
        System.out.println("修改名字后叫：" + myDog.getName());

        //toString方法输出信息
        System.out.println(myDog);
    }
}
