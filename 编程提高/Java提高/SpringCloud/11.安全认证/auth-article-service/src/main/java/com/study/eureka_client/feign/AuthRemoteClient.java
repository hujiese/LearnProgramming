package com.study.eureka_client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.study.auth.common.ResponseData;

/**  
 * 认证服务API调用客户端
 **/ 
@FeignClient(value = "auth-service", path = "/oauth") 
public interface AuthRemoteClient {
	
  /**      
   * 调用认证,获取token      
   * @param query      
   * @return      
   */ 
   @PostMapping("/token") 
   ResponseData auth(@RequestBody AuthQuery query); 
   
}