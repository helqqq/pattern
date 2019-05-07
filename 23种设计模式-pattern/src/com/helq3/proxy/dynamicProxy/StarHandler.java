package com.helq3.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 处理器对象：过invoke方法实现对真实角色的代理访问
 */
public class StarHandler implements InvocationHandler{
	Star realStar;
	
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}

	/**
	 * 代理类调用方法时，统一到handler的invoke方法中处理
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("sing")){ //如果方法名是sing唱歌，则调用真实角色的方法，其他方法代理角色自行处理。
			method.invoke(this.realStar, args);
		}else{
			System.out.println("代理角色处理了");
		}
		return null;
	}

}
