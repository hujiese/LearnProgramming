package com.study.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = { "classpath:applicationContext.xml" })
public class JobApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JobApplication.class, args);
	}

}
