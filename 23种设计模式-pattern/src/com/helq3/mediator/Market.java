package com.helq3.mediator;

public class Market implements Department{
	private Mediator mediator;
	
	public Market(Mediator mediator) {
		this.mediator = mediator;
		mediator.regesiter("market", this);
	}
	public void selfAction() {
		System.out.println("拉项目");
	}
	public void outAction() {
		System.out.println("给公司提供新的项目");
	}
}
