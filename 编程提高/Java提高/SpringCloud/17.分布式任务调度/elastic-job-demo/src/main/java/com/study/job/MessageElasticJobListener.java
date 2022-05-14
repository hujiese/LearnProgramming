package com.study.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.ElasticJobListener;

/**
 * 作业监听器, 执行前后发送告警信息
 */
public class MessageElasticJobListener implements ElasticJobListener {

    @Override
    public void beforeJobExecuted(ShardingContexts shardingContexts) {
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String msg = date + " 【脚本测试-" + shardingContexts.getJobName() + "】任务开始执行====" + JsonUtils.toJson(shardingContexts);
        System.out.println(msg);
    }

    @Override
    public void afterJobExecuted(ShardingContexts shardingContexts) {
    	String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String msg = date + " 【脚本测试-" + shardingContexts.getJobName() + "】任务执行结束====" + JsonUtils.toJson(shardingContexts);
        System.out.println(msg);
    }

}