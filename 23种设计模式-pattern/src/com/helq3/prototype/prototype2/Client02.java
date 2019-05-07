package com.helq3.prototype.prototype2;

import java.util.Date;

public class Client02 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(11111111111L);
		System.out.println(date);
		Sheep s1 = new Sheep("多利",date);
		Sheep s2 = (Sheep) s1.clone();
		date.setTime(11111L);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		s2.setSname("少女");
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
		
		
	}
}
