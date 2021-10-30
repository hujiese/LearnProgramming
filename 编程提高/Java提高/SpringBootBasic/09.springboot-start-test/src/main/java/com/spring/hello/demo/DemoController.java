package com.spring.hello.demo;

import com.demo.starter.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DBService dbService;

    @GetMapping("/hello")
    public String testdb() {
        dbService.save();
        dbService.delete();
        dbService.update();
        dbService.query();
        return "Hello Spring Boot !";
    }
}

