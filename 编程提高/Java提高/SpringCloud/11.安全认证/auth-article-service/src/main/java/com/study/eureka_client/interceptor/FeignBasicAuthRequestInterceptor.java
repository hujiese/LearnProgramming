package com.study.eureka_client.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * Feign请求拦截器
 **/
public class FeignBasicAuthRequestInterceptor implements RequestInterceptor {
	public FeignBasicAuthRequestInterceptor() {
		
	}

	@Override
	public void apply(RequestTemplate template) {
		template.header("Authorization", System.getProperty("study.auth.token"));
	}
}