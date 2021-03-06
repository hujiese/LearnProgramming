package com.study.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.bean.Person;
import com.study.config.MainConfigOfPropertyValues;

public class IOCTest_PropertyValue {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
    @Test
    public void test01(){
        printBeans(applicationContext);
        System.out.println("=============");

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

}
