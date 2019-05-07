package com.helq3.factory.abstractfactory;

public class Client {
	public static void main(String[] args) {
		CarFactory lowCar = new LowCarFactory();
		CarFactory luxuryCar = new LuxuryCarFactory();
		Engine engine = lowCar.createEngine();
		engine.start();
		engine.run();
	}
}
