package com.study.feign_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.feign_demo.remote.UserRemoteClient;

@RestController
public class DemoController {

	@Autowired
	private UserRemoteClient userRemoteClient;

	@GetMapping("/callHello")
	public String callHello() {
		System.err.println("进来了。。。。。");
		String result = userRemoteClient.hello();
		System.out.println(" 调用结果：" + result);
		return result;
	}

}
