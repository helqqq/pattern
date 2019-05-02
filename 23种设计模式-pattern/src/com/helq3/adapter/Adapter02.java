package com.helq3.adapter;
/**
 * 对象适配器：转接口，既有USB接口，又有键盘
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Adapter02 implements Target{
	private Adaptee adaptee;
	public Adapter02(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	public void handleReq() {
		this.adaptee.request();
	}
	
}
