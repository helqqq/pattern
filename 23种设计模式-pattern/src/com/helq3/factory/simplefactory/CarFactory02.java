package com.helq3.factory.simplefactory;
/**
 * 简单工厂模式
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class CarFactory02 {
	public static Car createAudi(){
		return new Audi();
	}
	public static Car createByd(){
		return new Byd();
	}
}
