package com.study.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.config.MainConfigOfLifeCycle;

public class IOCTest_LifeCycle {

    @Test
    public void test01(){
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("IOC ok ...");
//        Car car = applicationContext.getBean(Car.class);
        applicationContext.destroy();
    }

}
