/**
 * quartz-scheduler:任务调度
 *	Builder模式
 *	Factory模式 组件模式 链式模式
 * 	核心：调度器 任务 触发器
 * 	JobDetail 
 * trigger 
 * 		SimpleTrigger 
 * 		CronTrigger
 * 		TriggerBuilder
 * 		ThreadPool
 * 	Scheduler
 *	组成：Job JonExceptionContext
 *		JobDetail	：Job实现类 newInstance实现Job
 *		JobBuilder: 创建JobDetail
 *		JobStore:	RAMJob  jdbcJob
 *	Trigger:
 *	Calendar:
 *	监听器：JobListener TriggerListener SchedulerListener
 * @author Administrator
 *
 */
package com.helq3.quartz;