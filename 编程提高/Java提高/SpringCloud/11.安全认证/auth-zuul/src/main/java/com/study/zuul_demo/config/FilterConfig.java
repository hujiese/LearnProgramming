package com.study.zuul_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.study.zuul_demo.filter.AuthHeaderFilter;

@Configuration
public class FilterConfig {

	@Bean
	public AuthHeaderFilter authHeaderFilter() {
		return new AuthHeaderFilter();
	}
	
}
