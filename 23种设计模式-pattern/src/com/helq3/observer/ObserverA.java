package com.helq3.observer;
/**
 * 观察者实现
 */
public class ObserverA implements Observer{
	private String myState;

	public String getMyState() {
		return myState;
	}

	public void setMyState(String myState) {
		this.myState = myState;
	}

	@Override
	public void update(Subject subject) {
		this.myState = ((ConcreteSubject) subject).getState();
	}	
}
