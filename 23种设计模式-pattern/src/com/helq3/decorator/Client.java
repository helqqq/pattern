package com.helq3.decorator;

/**
 * 测试
 */
public class Client {
	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		System.out.println("-------------增加飞的功能-------------");
		SuperCar f = new FlyCar(car);
		f.move();
		System.out.println("-------------再增加游的功能-------------");
		SuperCar w = new WaterCar(f);
		w.move();
		System.out.println("-------------再增加人工智能的功能-------------");
		SuperCar a= new AICar(new FlyCar(new Car()));
		a.move();
	}
}
