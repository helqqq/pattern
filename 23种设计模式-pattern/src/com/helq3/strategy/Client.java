package com.helq3.strategy;

public class Client {
	public static void main(String[] args) {
		NewCustomerManyStrategy nms = new NewCustomerManyStrategy();
		Context ctx = new Context(nms);
		ctx.printPrice(998);
	}
}
