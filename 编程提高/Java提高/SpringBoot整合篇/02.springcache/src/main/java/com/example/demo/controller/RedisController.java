package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class RedisController {
    @Autowired
    UserService userService;

    @GetMapping("/save/{name}/{age}")
    public int save(@PathVariable("name") String name, @PathVariable("age") String age) {
        return userService.save(name, age);
    }

    @GetMapping("/{id}")
    public User ForTest(@PathVariable String id){
        return userService.selectUser(id);
    }

    @GetMapping( "/update")
    public String update(User user){
        userService.updataById(user);
        return "success";
    }

    @GetMapping( "/delete/{id}")
    public String delete (@PathVariable String id){
        userService.deleteById(id);
        return "delete success";
    }
}