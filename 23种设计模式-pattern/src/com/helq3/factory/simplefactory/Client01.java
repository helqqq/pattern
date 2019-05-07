package com.helq3.factory.simplefactory;
/**
 * 没有工厂模式下实例化
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Client01 {
	public static void main(String[] args) {
		Car audi = new Audi();
		Car byd = new Byd();
		audi.run();
		byd.run();
	}
}
