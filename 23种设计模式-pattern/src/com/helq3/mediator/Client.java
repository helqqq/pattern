package com.helq3.mediator;

public class Client {
	public static void main(String[] args) {
		Mediator mediator = new President();//中介者角色（总经理）
		Department d = new Development(mediator);
		Department f = new Finascial(mediator);
		Department m = new Market(mediator);
		d.outAction();
	}
}
