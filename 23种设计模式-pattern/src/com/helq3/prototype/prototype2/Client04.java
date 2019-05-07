package com.helq3.prototype.prototype2;

import java.util.Date;

/**
 * 测试原型模式和new的耗时:
 * 构造(new)对象耗费资源或耗时特别大的情况，适合原型模式，可以在构造函数处Thread.sleep(10);一下
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Client04 {
	public static void testNew(long times){
		long start = System.currentTimeMillis();
		for(int i = 0; i < times; i++){
			Sheep02 s = new Sheep02("new",new Date());
		}
		long end = System.currentTimeMillis();
		System.out.println("new耗时："+(end-start));
		
	}
	public static void testPrototype(long times) throws CloneNotSupportedException{
		long start = System.currentTimeMillis();
		Sheep02 s = new Sheep02("prototype",new Date());
		for (int i = 0; i < times; i++) {
			Sheep02 s2 = (Sheep02) s.clone();
		}
		long end = System.currentTimeMillis();
		System.out.println("prototype:"+(end-start));
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		testNew(10000000L);
		testPrototype(10000000L);
	}
}
