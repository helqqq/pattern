package com.helq3.singleton;

/**
 * 双重检查锁实现单例模式 由于编译器优化原理和JVM底层内部模型原因，偶尔出问题，不建议使用
 * 
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Singleton03 {
	public static Singleton03 instance = null;

	private Singleton03() {
	}

	public static Singleton03 getInstance() {
		if (instance == null) {
			Singleton03 s;
			synchronized (Singleton03.class) {
				s = instance;
				if (s == null) {
					synchronized (Singleton03.class) {
						if (s == null) {
							s = new Singleton03();
						}
					}
					instance = s;
				}
			}
		}
		return instance;
	}
}
