package com.helq3.observer2;
/**
 * 目标对象
 */
public class ConcreteSubject extends java.util.Observable{
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;//目标对象状态发生了变化
		this.setChanged();//目标对象已经做了更改
		this.notifyObservers();//通知所有的观察者对象
	}
}	
