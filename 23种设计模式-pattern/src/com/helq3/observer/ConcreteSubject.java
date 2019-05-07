package com.helq3.observer;

public class ConcreteSubject extends Subject{
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		super.notifyAllObserver();
	}
}
