package com.helq3.prototype.prototype;
/**
 * 负责实现复制现有实例并生成新实例的方法
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class MessageBox implements Product {
	private char decochar;
	
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}
	/**
	 * 将字段包装输出，以表示类似的类clone很麻烦，如果直接用把decochar用*代替
	 ******
	 * 22 *
	 ******
	 */
	public void use(String s) {
		int len = s.getBytes().length;
		for(int i = 0; i < len+4; i++){
			System.out.print(decochar);
		}
		System.out.println();
		System.out.println(decochar + " " + s + " " + decochar);
		for (int i = 0; i < len + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println();
	}
	/**
	 * 浅克隆,一个类只有继承了Cloneable才能使用clone()方法,否则会报CloneNotSupportedException异常
	 */
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}
