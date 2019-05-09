package com.imook.demo.HelloQuartz;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class TestSimpleTrigger {
	public static void main(String[] args) throws SchedulerException {
		JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("job2", "jgroup2").build();
		SimpleTrigger strigger = TriggerBuilder.newTrigger().withIdentity("st1", "sg1").startNow()
				.withSchedule(SimpleScheduleBuilder.simpleSchedule()
						.withIntervalInSeconds(2)
						.withRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY))
				.build();
		SchedulerFactory factory = new StdSchedulerFactory();
		Scheduler scheduler = factory.getScheduler();
		scheduler.scheduleJob(jobDetail, strigger);
		scheduler.start();
	}
}
