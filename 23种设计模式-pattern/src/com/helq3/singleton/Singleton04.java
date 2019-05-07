package com.helq3.singleton;
/**
 * 静态内部类实现单例模式
 * 这种方式：线程安全，调用效率高，并且实现延时加载
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Singleton04 {
	/**
	 * 静态内部类（static class 私有 内部）
	 * 
	 */
	private static class SingletonClassInstance{
		private static final Singleton04 instance = new Singleton04();
	}
	/**方法没有同步，调用效率高*/
	public static Singleton04 getInstance(){
		return SingletonClassInstance.instance;
	}
	/**
	 * 构造器私有化，外部无法实例化
	 */
	private Singleton04(){}
}
