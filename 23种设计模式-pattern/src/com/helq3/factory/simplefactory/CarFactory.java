package com.helq3.factory.simplefactory;
/**
 * 简单工厂模式
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class CarFactory {
	public static Car createCar(String type){
		if("奥迪".equals(type)){
			return new Audi();
		}else if("比亚迪".equals(type)){
			return new Byd();
		}else {  //如果扩展新的产品，则需修改已有代码
			return null;
		}
	}
}
