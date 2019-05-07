package com.helq3.factory.abstractfactory;

public interface Seat {
	void message();
}
class LowSeat implements Seat{
	public void message() {
		System.out.println("不能按摩");
	}
}
class LuxurySeat implements Seat{
	public void message() {
		System.out.println("可以自动按摩");
	}
	
}