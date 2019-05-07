package com.helq3.proxy.staticproxy;
/**
 * 客户端测试:所有的操作都是代理做的，只有唱歌是真实明星唱的
 */
public class Client {
	public static void main(String[] args) {
		Star sstar = new SuperStar();
		Star proxystart = new ProxyStar(sstar);
		proxystart.confer();
		proxystart.signContract();
		proxystart.bookTicket();
		proxystart.sing();
		proxystart.collecMoney();
	}
}
