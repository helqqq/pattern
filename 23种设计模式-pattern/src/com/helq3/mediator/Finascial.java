package com.helq3.mediator;

public class Finascial implements Department{
	private Mediator mediator;
	
	public Finascial(Mediator mediator) {
		this.mediator = mediator;
		mediator.regesiter("finascial", this);
	}
	public void selfAction() {
		System.out.println("数钱");
	}
	public void outAction() {
		System.out.println("钱很多，没法花");
	}
}
