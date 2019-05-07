package com.helq3.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 测试反射和反序列化生成单例对象
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Client02 {
	public static void main(String[] args) throws Exception{
		Singleton06 s1 = Singleton06.getInstance();
		Singleton06 s2 = Singleton06.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		
		//利用反射原理生成单例模式
		Class<Singleton06> clazz = (Class<Singleton06>) Class.forName("com.helq3.singleton.Singleton06");
		Constructor<Singleton06> c = clazz.getDeclaredConstructor(null);
		c.setAccessible(true); //跳过权限的检查，即private构造器
		Singleton06 s3 = c.newInstance();
		Singleton06 s4 = c.newInstance();
		System.out.println(s3);
		System.out.println(s4);
		//反序列化创建单例模式
		FileOutputStream fos = new FileOutputStream("e:/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/a.txt"));
		Singleton06 s5 = (Singleton06) ois.readObject();
		
		System.out.println(s5);
		
	}
}
