package com.helq3.prototype.prototype2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 通过序列化和反序列化实现深克隆
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Client03 {
	public static void main(String[] args) throws CloneNotSupportedException, Exception {
		Date date = new Date(33333333333L);
		System.out.println(date);
		Sheep s1 = new Sheep("多利",date);
//		Sheep s2 = (Sheep) s1.clone();
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Sheep s2 = (Sheep) ois.readObject();
		date.setTime(1111111L);
		s2.setSname("邵丽");
		System.out.println(s1.getSname()+":"+s1.getBirthday());
		System.out.println(s2.getSname()+":"+s2.getBirthday());
	}
}
