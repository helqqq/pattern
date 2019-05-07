package com.helq3.factory.factorymethod;
/**
 * 
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Client {
	public static void main(String[] args) {
		Car c1 = new AudiFactory().createCar();
		Car c2 = new BydFactory().createCar();
		c1.run();
		c2.run();
	}
}	
