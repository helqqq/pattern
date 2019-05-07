package com.helq3.singleton;

/**
 * 测试饿汉式加载模式
 *	线程安全，调用效率高，不能实现延时加载 
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Singleton01 {
	// 类初始化时，立即加载这个对象（没有延迟加载的优势），类加载的时候，天然线程安全的。
	private static Singleton01 instance = new Singleton01();

	// 构造函数私有化
	private Singleton01() {
	}

	// 方法没有同步，调用效率高
	public static Singleton01 getInstance() {
		return instance;
	}
}
