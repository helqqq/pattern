package com.helq3.singleton;
/**
 * ≤‚ ‘
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Client {
	public static void main(String[] args) {
		Singleton01 s3 = Singleton01.getInstance();
		Singleton01 s4 = Singleton01.getInstance();
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(Singleton05.INSTANCE == Singleton05.INSTANCE);
	}
}
