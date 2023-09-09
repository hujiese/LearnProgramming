package com.study.springcloud.alibaba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RefreshScope //支持Nacos的动态刷新功能。
public class ConsumerController {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping(value = "/consumer/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Integer id) {
        logger.info("config info is: " + configInfo);

        return restTemplate.getForObject(serverURL+"/provider/nacos/" + id, String.class);
    }
}
