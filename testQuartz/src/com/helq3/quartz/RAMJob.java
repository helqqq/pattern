package com.helq3.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RAMJob implements Job {
	private static Logger logger = LoggerFactory.getLogger(RAMJob.class);
	@Override
	public void execute(JobExecutionContext jec) throws JobExecutionException {
		System.out.println(jec.getTrigger().getJobDataMap()+" trigger.time:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
}
