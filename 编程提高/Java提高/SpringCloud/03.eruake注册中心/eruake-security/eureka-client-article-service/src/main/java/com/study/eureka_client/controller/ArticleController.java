package com.study.eureka_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ArticleController {

	@Autowired 	
	private RestTemplate restTemplate;
	
	@GetMapping("/article/callHello2") 	
	public String callHello2() { 		
	    return restTemplate.getForObject(
			"http://eureka-client-user-service/user/hello", String.class); 	
	}
	
}
