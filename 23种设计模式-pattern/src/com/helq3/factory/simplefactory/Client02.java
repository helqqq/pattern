package com.helq3.factory.simplefactory;
/**
 * 简单工厂模式调用
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Client02 {

	public static void main(String[] args) {
		Car audi = CarFactory.createCar("奥迪");
		Car byd = CarFactory.createCar("比亚迪");
		audi.run();
		byd.run();
		
		Car audi02 = CarFactory02.createAudi();
		Car byd02 = CarFactory02.createByd();
		audi02.run();
		byd02.run();
	}

}
