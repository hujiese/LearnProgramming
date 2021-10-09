package com.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.study.bean.Person;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value={"classpath:/person.properties"})
@Configuration
public class MainConfigOfPropertyValues {

    @Bean
    public Person person(){
        return new Person();
    }

}
