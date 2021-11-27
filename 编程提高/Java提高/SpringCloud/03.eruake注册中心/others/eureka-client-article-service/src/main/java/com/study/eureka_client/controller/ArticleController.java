package com.study.eureka_client.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ArticleController {

	@Autowired 	
	private RestTemplate restTemplate;

	@Autowired
	private EurekaClient eurekaClient;

	@GetMapping("/article/infos")
	public Object serviceUrl() {
		return eurekaClient.getInstancesByVipAddress("eureka-client-user-service", false);
	}

	@GetMapping("/article/callHello2") 	
	public String callHello2() { 		
	    return restTemplate.getForObject(
			"http://eureka-client-user-service/user/hello", String.class); 	
	}
	
}
