package com.helq3.prototype.prototype;
/**
 * 原型抽象接口:负责定义用于复制现有实例来生成新实例的方法
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public interface Product extends Cloneable {
	void use(String s);
	Product createClone();//克隆实例
}	
