package com.study.config;

import com.study.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan("com.study.bean")
@Configuration
public class MainConfigOfLifeCycle {
    @Bean(initMethod = "init", destroyMethod = "detory")
    @Scope("prototype")
    public Car car(){
        return new Car();
    }

}