package com.helq3.singleton;
/**
 * 枚举类实现单例模式
 * 线程安全，调用效率高，不是实现延时加载
 * 基于JVM底层实现，天然的防止反射和反序列漏洞
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public enum Singleton05 {
	//instance就是这个类的一个单例对象
	INSTANCE;
	
	public void SingletonOperation(){
		
	}
}
