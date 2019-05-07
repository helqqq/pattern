package com.helq3.singleton;

/**
 * 懒汉式实现: 资源利用效率高了（真正用的时候才加载），但是每次调用都要等待，并发效率低。
 * lazy load 懒加载 延时加载 真正用到时才加载
 * 并发调用时，可能导致生成多个对象，此处使用 synchronized 锁定资源，因此需要等待，并发效率低。
 * @author Helena  https://github.com/helqqq/pattern.git
 *
 */
public class Singleton02 {
	// 不初始化，延时加载，真正使用时再加载
	private static Singleton02 instance;

	// 私有化构造器
	private Singleton02() {
	}
	
	//方法同步，资源利用率高
	public static synchronized Singleton02 getInstance() {
		if (instance == null) {
			instance = new Singleton02();
		}
		return instance;

	}
}
