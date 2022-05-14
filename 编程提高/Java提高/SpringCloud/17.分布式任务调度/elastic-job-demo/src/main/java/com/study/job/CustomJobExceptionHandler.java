package com.study.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dangdang.ddframe.job.executor.handler.JobExceptionHandler;

/**
 * 自定义异常处理，在任务异常时可发出告警
 */
public class CustomJobExceptionHandler implements JobExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(CustomJobExceptionHandler.class);

    @Override
    public void handleException(String jobName, Throwable cause) {
        logger.error(String.format("Job '%s' exception occur in job processing", jobName), cause);
        System.out.println("【"+jobName+"】任务异常。" + cause.getMessage());
    }

}