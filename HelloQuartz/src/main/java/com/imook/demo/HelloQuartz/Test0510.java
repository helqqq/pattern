package com.imook.demo.HelloQuartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class Test0510 {
	public static void main(String[] args) throws SchedulerException {
		//任务
		JobDetail jd = JobBuilder.newJob(HelloJob.class).withIdentity("j1", "g1").build();
		//定时器
		Trigger tri = TriggerBuilder.newTrigger().withIdentity("t1", "tg1")
				.startNow()
//				.withSchedule(SimpleScheduleBuilder.simpleSchedule())
				.withSchedule(CronScheduleBuilder.cronSchedule("50/5 23-25 11 ? 5 * *"))
				.build();
		//调度器
		SchedulerFactory factory = new StdSchedulerFactory();
		Scheduler s = factory.getScheduler();
		//注册任务和定时器
		s.scheduleJob(jd, tri);
		s.start();
	}
}
