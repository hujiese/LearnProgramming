package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class logTest {

    private Logger logger = LoggerFactory.getLogger(logTest.class);

    @Scheduled(fixedRate = 1000)
    public void logtest() {
        logger.trace("trace日志");
        logger.debug("debug日志");
        logger.info("info日志");
        logger.warn("warn日志");
        logger.error("error日志");
    }

}
