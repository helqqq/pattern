package com.helq3.proxy.dynamicProxy;
/**
 * 真实角色：超级巨星
 */
public class SuperStar implements Star{

	@Override
	public void confer() {
		System.out.println("---confer");
		
	}

	@Override
	public void signContract() {
		System.out.println("--signContract");
	}

	@Override
	public void bookTicket() {
		System.out.println("--bookTicket");
	}

	@Override
	public void sing() {
		System.out.println("周杰伦本人唱歌啦");
	}

	@Override
	public void collecMoney() {
		System.out.println("----collecMoney");
	}

}
