package com.helq3.proxy.dynamicProxy;
/**
 * 手动建动态代理类 来理解动态代理的内部结构
 * 1，实现Star抽象类的方法
 */
public class ProxyStar implements Star{
	private StarHandler handler;
	public ProxyStar(StarHandler handler) {
		this.handler = handler;
	}
	public void sing() {
		//唱歌:通过处理器invoke处理
//		handler.invoke(this.getClass(), sing, null);
	}

	public void confer() {
		//面谈,通过处理器invoke处理
//		handler.invoke(this.getClass(), confer, null);
	}

	@Override
	public void signContract() {
	}

	@Override
	public void bookTicket() {
		
	}
	public void collecMoney() {
		
	}

}
