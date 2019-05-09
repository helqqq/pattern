package com.imook.demo.HelloQuartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *	定义自动任务
 * @author Helena
 *
 */
public class HelloScheduler {
	private static Logger log = LoggerFactory.getLogger(HelloScheduler.class);
	public static void main(String[] args) throws SchedulerException  {
		// 创建JobDetail实例，将该实例与HelloJob绑定   任务器
		JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)
				.withIdentity("job1", "jobgroup1")
				.usingJobData("user", "Henena")
				.usingJobData("module","自动任务")
				.build();
		System.out.println("jobDetail.name:"+jobDetail.getKey().getName());
		System.out.println("jobDetail.group:"+jobDetail.getKey().getGroup());
		System.out.println("jobDetail.getKey:"+jobDetail.getKey());
		System.out.println("jobDetail.jobClass:"+jobDetail.getJobClass());
		System.out.println("jobDetail.JobDataMap:"+jobDetail.getJobDataMap());
		//创建Trigger实例，定义该job立刻执行，并每隔两秒执行一次，知道永远  触发器
		Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity("trigger1","tGroup1")
				.startNow() //现在开始   .startAt()//定义开始时间
				.usingJobData("user", "Henena")
				.usingJobData("date",new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
				.usingJobData("temperature", 21)
				.withSchedule(
						SimpleScheduleBuilder.simpleSchedule().
						withIntervalInSeconds(2)  //时间间隔是2s
						.withRepeatCount(1))  //一直执行
				.build();
		//创建Scheduler实例  调度器
		SchedulerFactory factory = new StdSchedulerFactory();
		Scheduler scheduler = factory.getScheduler();
		scheduler.start(); //调度器开始执行
		scheduler.scheduleJob(jobDetail, trigger);//设定要调度的任务和触发
		//log.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
}
