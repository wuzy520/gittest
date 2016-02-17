package com.wuzy.za;

import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class ThreadPool extends ThreadPoolExecutor {

	private ConcurrentHashMap<String, Date> startTimes;
	
	public ThreadPool(int corePoolSize, int maximumPoolSize,
			long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
		startTimes=new ConcurrentHashMap<>();
	}

	@Override
	public void shutdown() {
		System.out.println("Executed tasks:"+getCompletedTaskCount());
		super.shutdown();
	}
	
	

	
	
	  
}
