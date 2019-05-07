package com.helq3.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 测试动态代理类
 */
public class Client {
	public static void main(String[] args) {
		// 真实角色
		Star realStar = new SuperStar();
		// 处理器对象
		StarHandler handler = new StarHandler(realStar);
		// 代理对象
		Star proxy = (Star) Proxy.newProxyInstance(
				ClassLoader.getSystemClassLoader(), 
				new Class[] { Star.class },
				handler);
		//通过代理对象调用真实对象的操作
		proxy.bookTicket();
		proxy.sing();
		proxy.collecMoney();
	}
}
