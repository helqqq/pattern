package com.helq3.adapter;
/**
 * 客户端
 * 发出需求的类，相当于 笔记本，只有USB 接口
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Client {
	
	public void test(Target t){
		t.handleReq();
	}
	public static void main(String[] args) {
		Client c = new Client();
		Adaptee adaptee = new Adaptee();
		Target t = new Adapter02(adaptee);
		c.test(t);
	}
}
