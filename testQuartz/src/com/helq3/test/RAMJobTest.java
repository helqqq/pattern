package com.helq3.test;

import java.util.Date;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import com.helq3.quartz.RAMJob;

public class RAMJobTest {
	
	public static void main(String[] args) throws SchedulerException {
		//创建Scheduler的工厂
		SchedulerFactory sf = new StdSchedulerFactory();
		
		//从工厂中获取调度器实例
		Scheduler scheduler = sf.getScheduler();
		
		// 创建一个JobDetail实例，指定SimpleJob
		JobDetail jobDetail = JobBuilder.newJob(RAMJob.class).withIdentity("job1_1", "group1").build();
		
		//开始运行时间
		long time = System.currentTimeMillis()+3*1000L;
		Date startTime = new Date(time);//3s后启动
		
		// 创建Trigger
		Trigger trigger = TriggerBuilder.newTrigger().
				withIdentity("ramTrigger", "ramTriggerGroup")   //初始化
				.withDescription("RAM调度器").startAt(startTime)   //描述
				.withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?"))
//				.withSchedule(SimpleScheduleBuilder.simpleSchedule()) 
				.build();	//初始化
		//注册任务和定时器
		scheduler.scheduleJob(jobDetail, trigger);
		
		//启动调度器
		scheduler.start();
	}
}
