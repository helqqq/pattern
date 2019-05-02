package com.helq3.adapter;
/**
 * 类适配器：转接口，既有USB接口，又有键盘
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Adapter extends Adaptee implements Target{
	public void handleReq() {
		super.request();
	}

}
