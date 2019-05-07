package com.helq3.strategy;
/**
 * 一般的程序员思维，不利于程序的扩展
 */
public class TestStrategy {
	public double getPrice(String type,double price){
		if("新客户小批量".equals(type)){
			System.out.println("不打折");
			return price;
		}else if("新客户大批量".equals(type)){
			System.out.println("打九折");
			return price*0.9;
		}else if("老客户小批量".equals(type)){
			System.out.println("不8.5折");
			return price*0.85;
		}else if("老客户大批量".equals(type)){
			System.out.println("打8折");
			return price*0.8;
		}
		return price;
	}
}
