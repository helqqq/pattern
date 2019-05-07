package com.helq3.factory.abstractfactory;
/**
 * 抽象工厂模式：不可以增加产品，可以增加产品族。
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public interface CarFactory {
	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}

