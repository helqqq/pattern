package com.helq3.prototype.prototype2;

import java.util.Date;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(11111111111L);
		System.out.println(date);
		Sheep02 s1 = new Sheep02("多利",date);
		Sheep02 s2 = (Sheep02) s1.clone();
		date.setTime(11111L);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		s2.setSname("少女");
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}
