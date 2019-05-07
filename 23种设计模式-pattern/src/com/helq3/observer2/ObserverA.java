package com.helq3.observer2;

import java.util.Observable;
import java.util.Observer;
/**
 * π€≤Ï’ﬂ
 */
public class ObserverA implements Observer{
	private int myState;
	
	public int getMyState() {
		return myState;
	}

	public void setMyState(int myState) {
		this.myState = myState;
	}

	@Override
	public void update(Observable o, Object arg) {
		this.myState = ((ConcreteSubject)o).getState();
	}

}
