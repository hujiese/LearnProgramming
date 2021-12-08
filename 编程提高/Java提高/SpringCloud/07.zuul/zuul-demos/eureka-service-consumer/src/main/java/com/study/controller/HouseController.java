package com.study.controller;

import com.study.bean.HouseInfo;
import com.study.remote.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HouseController {

    @Autowired
    private UserRemoteClient userRemoteClient;

    @GetMapping("/call/data")
    public HouseInfo getData(String name) {
        return userRemoteClient.getData();
    }
}
