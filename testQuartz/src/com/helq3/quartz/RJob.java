package com.helq3.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RJob implements Job{
	private static Logger log = LoggerFactory.getLogger(RJob.class);
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		log.info(context.getJobDetail().getJobDataMap() + "");
	}

}
