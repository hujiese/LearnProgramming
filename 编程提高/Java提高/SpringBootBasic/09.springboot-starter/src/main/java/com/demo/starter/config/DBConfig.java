package com.demo.starter.config;

import com.demo.starter.properties.DemoSQLProperties;
import com.demo.starter.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DemoSQLProperties.class)
@ConditionalOnClass(DBService.class)
public class DBConfig {

    @Autowired
    private DemoSQLProperties demoSQLProperties;

    @Bean
    @ConditionalOnMissingBean
    public DBService getHashCodeClass(){
        String driverClassName = demoSQLProperties.getDriverClassName();
        String url = demoSQLProperties.getUrl();
        String username = demoSQLProperties.getUsername();
        String password = demoSQLProperties.getPassword();

        return new DBService(driverClassName, url, username, password);
    }
}
