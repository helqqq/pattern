package com.imook.demo.HelloQuartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.quartz.Trigger;
/**
 * 
 * @author Administrator
 *
 */
public class HelloJob implements Job {
	private String user;
	private String date;
	private String module;
	private int temperature;
	
	public void setUser(String user) {
		this.user = user;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public void execute(JobExecutionContext context) throws JobExecutionException {
		//打印当前执行时间
		System.out.println("currentTime："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		System.out.println("当前类的实例化："+this);
		JobDetail jobDetail = context.getJobDetail();
		Trigger trigger = context.getTrigger();
		JobDataMap jdataMap = context.getJobDetail().getJobDataMap();
		JobDataMap tdataMap = context.getTrigger().getJobDataMap();
		JobDataMap alldataMap = context.getMergedJobDataMap();
//		System.out.println("jobDetail.JobDataMap.user:"+jdataMap.getString("user"));
//		System.out.println("jobDetail.JobDataMap.module:"+jdataMap.getString("module"));
//		System.out.println("trigger.JobDataMap.date:"+tdataMap.getString("date"));
//		System.out.println("alldataMap.JobDataMap.date:"+alldataMap.getInt("temperature"));
//		System.out.println("jobDetail.JobDataMap:"+jdataMap.size());
//		System.out.println("trigger.JobDataMap:"+tdataMap.size());
//		System.out.println("all.JobDataMap:"+alldataMap.size());
//		System.out.println(this.user+","+this.date+","+this.module+","+this.temperature);
//		JobKey jobKey = context.getTrigger().getJobKey();
//		System.out.println("startTime:"+context.getTrigger().getStartTime());
//		System.out.println("endTime:"+context.getTrigger().getEndTime());
//		System.out.println("jobKey info:"+jobKey.getName()+jobKey.getGroup());
	}
}
