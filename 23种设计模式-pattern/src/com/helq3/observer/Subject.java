package com.helq3.observer;

import java.util.ArrayList;
import java.util.List;
/**
 * 目标对象
 */
public class Subject {
	//持有观察者列表
	protected List<Observer> list = new ArrayList<Observer>();
	public void registerObserver(Observer o){
		list.add(o);
	}
	public void removeObserver(Observer o){
		list.remove(o);
	}
	//通知所有的观察者
	public void notifyAllObserver(){
		for(Observer obs: list){
			obs.update(this);
		}
	}
}
