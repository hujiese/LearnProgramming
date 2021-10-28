package com.spring.hello.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(Logger.class);

    @GetMapping("/hello")
    public String hello() {
        logger.info("/hello invoked !");
        return "Hello Spring Boot !";
    }
}

