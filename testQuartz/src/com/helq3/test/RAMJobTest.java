package com.helq3.test;

import java.util.Date;

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

import com.helq3.quartz.RAMJob;

public class RAMJobTest {
	
	public static void main(String[] args) throws SchedulerException {
		//����Scheduler�Ĺ���
		SchedulerFactory sf = new StdSchedulerFactory();
		
		//�ӹ����л�ȡ������ʵ��
		Scheduler scheduler = sf.getScheduler();
		
		// ����һ��JobDetailʵ����ָ��SimpleJob
		JobDetail jobDetail = JobBuilder.newJob(RAMJob.class).withIdentity("job1_1", "group1").build();
		
		//��ʼ����ʱ��
		long time = System.currentTimeMillis()+3*1000L;
		Date startTime = new Date(time);//3s������
		
		// ����Trigger
		Trigger trigger = TriggerBuilder.newTrigger().
				withIdentity("ramTrigger", "ramTriggerGroup")   //��ʼ��
				.withDescription("RAM������").startAt(startTime)   //����
				.withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?"))
//				.withSchedule(SimpleScheduleBuilder.simpleSchedule()) 
				.build();	//��ʼ��
		//ע������Ͷ�ʱ��
		scheduler.scheduleJob(jobDetail, trigger);
		
		//����������
		scheduler.start();
		
		
	}
}