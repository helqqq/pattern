package com.helq3.proxy.staticproxy;
/**
 * 代理角色：代理各种真实角色不用干的事儿，签协议...
 */
public class ProxyStar implements Star{
	private Star superstar;
	
	
	public ProxyStar(Star superstar) {
		this.superstar = superstar;
	}

	@Override
	public void confer() {
		System.out.println("proxyStart--confer");
	}

	@Override
	public void signContract() {
		System.out.println("proxyStart--signContract");
	}

	@Override
	public void bookTicket() {
		System.out.println("proxyStart--bookTicket");
	}

	@Override
	public void sing() {
		superstar.sing();
	}

	@Override
	public void collecMoney() {
		System.out.println("proxyStart--collecMoney");
	}

}
