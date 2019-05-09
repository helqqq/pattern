package com.imook.demo.HelloQuartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.DirectSchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
/**
 * 所有的Scheduler实例应该由SchedulerFactory来创建
 * @author Administrator
 *
 */
public class TestCronTrigger {
	public static void main(String[] args) throws SchedulerException {
		JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("job2", "jgroup2").build();
		//配置触发器 一秒一次
		CronTrigger ctrigger = TriggerBuilder.newTrigger().withIdentity("st1", "sg1").startNow()
				.withSchedule(CronScheduleBuilder.cronSchedule("* * * ? * * *"))
				.build();
//		SchedulerFactory factory = new StdSchedulerFactory();
//		Scheduler scheduler = factory.getScheduler();
//		scheduler.scheduleJob(jobDetail, ctrigger);
//		scheduler.start();
		//
		DirectSchedulerFactory f2 = DirectSchedulerFactory.getInstance();
		f2.createVolatileScheduler(10);
		Scheduler s2 = f2.getScheduler();
		s2.scheduleJob(jobDetail, ctrigger);
		s2.start();
	}
}
