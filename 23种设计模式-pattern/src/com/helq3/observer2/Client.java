package com.helq3.observer2;

public class Client {
	public static void main(String[] args) {
		//创建目标对象
		ConcreteSubject sub = new ConcreteSubject();
		//创建观察者
		ObserverA obs = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		sub.addObserver(obs);
		sub.addObserver(obs2);
		sub.addObserver(obs3);
		
		//修改目标对象的状态
		sub.setState(22);
		//获取观察者的状态
		System.out.println(obs.getMyState());
		System.out.println(obs2.getMyState());
		
		System.out.println("---------");
		
		sub.setState(44);
		//获取观察者的状态
		System.out.println(obs.getMyState());
		System.out.println(obs2.getMyState());
	}
}
