package com.study.eureka_client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**  
 * 认证服务API调用客户端
 **/ 
@FeignClient(value = "auth-user-service") 
public interface UserRemoteClient {
   @GetMapping("/user/hello") 
   String hello();
}