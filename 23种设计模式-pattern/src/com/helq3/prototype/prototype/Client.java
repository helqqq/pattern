package com.helq3.prototype.prototype;
/**
 * µ÷ÓÃÕß
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Client {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.register("one", new MessageBox('*'));
		m.register("two", new MessageBox('&'));
		m.register("three", new UnderlinePen('_'));
		Product p = m.create("one");
		p.use("hello world");
	}
}
