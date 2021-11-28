package com.study.apollo_springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * 自定义Apollo配置类
 * @author jack
 *
 */
@Data
@Configuration
public class UserConfig {

	@Value("${username:jack}")
	private String username;
}
