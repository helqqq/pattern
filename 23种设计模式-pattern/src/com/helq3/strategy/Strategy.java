package com.helq3.strategy;
/**
 * 策略模式接口
 */
public interface Strategy {
	double getPrice(double price);//此处不需要类型了，一个类型一个实现类
}
