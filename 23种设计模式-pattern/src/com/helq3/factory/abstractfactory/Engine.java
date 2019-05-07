package com.helq3.factory.abstractfactory;
/**
 * 引擎
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public interface Engine {
	void run();
	void start();
}
class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("跑的慢");
	}

	@Override
	public void start() {
		System.out.println("启动慢！");
	}
	
}
class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("跑的快");
	}

	@Override
	public void start() {
		System.out.println("启动快");
	}
	
}
