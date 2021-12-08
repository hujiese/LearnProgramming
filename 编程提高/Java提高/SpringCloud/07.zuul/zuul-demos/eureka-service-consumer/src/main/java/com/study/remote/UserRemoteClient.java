package com.study.remote;

import com.study.bean.HouseInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(value="eureka-service-provider")
public interface UserRemoteClient {

    @GetMapping("/house/data")
    public HouseInfo getData();
}