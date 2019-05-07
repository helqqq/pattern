package com.helq3.mediator;

public class Development implements Department{
	private Mediator mediator;
	
	public Development(Mediator mediator) {
		this.mediator = mediator;
		mediator.regesiter("development", this);
	}
	public void selfAction() {
		System.out.println("研发新产品");
	}
	public void outAction() {
		System.out.println("没经费了，请求支援");
		mediator.command("finascial");
	}
	
}
