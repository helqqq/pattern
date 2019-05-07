package com.helq3.strategy;
/**
 * 具体的策略类
 */
public class NewCustomerFewStrategy implements Strategy{
	@Override
	public double getPrice(double price) {
		System.out.println("不打折");
		return price;
	}
}
class NewCustomerManyStrategy implements Strategy{
	@Override
	public double getPrice(double price) {
		System.out.println("打九折");
		return price * 0.9;
	}
}
class OldCustomerFewStrategy implements Strategy{
	@Override
	public double getPrice(double price) {
		System.out.println("打八点五折");
		return price * 0.85;
	}
}
class OldCustomerManyStrategy implements Strategy{
	@Override
	public double getPrice(double price) {
		System.out.println("打八折");
		return price * 0.8;
	}
}
