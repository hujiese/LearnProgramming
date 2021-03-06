package com.study.job;

import java.util.Arrays;
import java.util.List;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;

public class MyDataflowJob implements DataflowJob<String> {

    @Override
	public List<String> fetchData(ShardingContext context) {
		return Arrays.asList("1", "2", "3");
	}

	@Override
	public void processData(ShardingContext context, List<String> data) {
		System.out.println("处理数据：" + data.toString());
	}

}
