package com.helq3.bridge;

public class Client {
	public static void main(String[] args) {
		//销售联想笔记本
		Computer c = new Laptop(new Lenovo());
		c.sale();
		//销售神州台式机
		Computer c2 = new Desktop(new Shenzhou());
		c2.sale();
	}
}
