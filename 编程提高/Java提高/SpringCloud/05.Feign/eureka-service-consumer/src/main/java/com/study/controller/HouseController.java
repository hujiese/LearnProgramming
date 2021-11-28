package com.study.controller;

import com.study.bean.HouseInfo;
import com.study.remote.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HouseController {

    @Autowired
    private UserRemoteClient userRemoteClient;

    @GetMapping("/call/data")
    public HouseInfo getData(@RequestParam("name") String name) {
        return userRemoteClient.getData(name);
    }

    @GetMapping("/call/data/{name}")
    public String getData2(@PathVariable("name") String name) {
        return userRemoteClient.getData2(name);
    }

    @GetMapping("/call/save")
    public Long add() {
        HouseInfo houseInfo = new HouseInfo();
        houseInfo.setCity("深圳");
        houseInfo.setRegion("南山");
        houseInfo.setName("深圳湾一号");
        Long id =userRemoteClient.addData(houseInfo);
        return id;
    }
}
