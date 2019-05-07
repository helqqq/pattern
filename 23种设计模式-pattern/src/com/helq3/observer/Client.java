package com.helq3.observer;

public class Client {
	public static void main(String[] args) {
		//目标对象
		ConcreteSubject subject = new ConcreteSubject();
		
		//多个观察者
		ObserverA obs1= new ObserverA();
		ObserverA obs2= new ObserverA();
		ObserverA obs3= new ObserverA();
		
		//将观察者加入到目标对象的队列
		subject.registerObserver(obs1);
		subject.registerObserver(obs2);
		subject.registerObserver(obs3);
		
		//目标对象发出变化
		subject.setState("200");
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println("----------");
		//目标对象发出变化
		subject.setState("300");
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		
	}
}
