package com.helq3.strategy;
/**
 * 负责和具体的策略类交互
 * 具体的算法和客户端分离了，使得算法可以独立于客户端独立的变化
 * 使用Spring的依赖注入功能，可以动态的注入不同策略对象，动态的切换不同的算法
 */
public class Context {
	private Strategy strategy;
	//可以通过构造器来注入，也可以通过set方式
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	public void printPrice(double price){
		System.out.println("您的报价是："+strategy.getPrice(price));
	}
}
