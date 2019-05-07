package com.helq3.singleton;

import java.io.Serializable;

/**
 * 懒加载
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Singleton06 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Singleton06 instance= null;
	
	public static Singleton06 getInstance(){
		if(instance == null){
			instance = new Singleton06();
		}
		return instance;
	}
	
	private Singleton06(){
		if(instance != null){
			throw new RuntimeException("单例模式非法调用（此处测试反射）");
		}
	}
	//反序列化时，直接调用这个方法，将单例对象返回去，而不需要单独创建新的方法
	private Object readResolve(){
		return instance;
	}
}
