package com.helq3.prototype.prototype;

public class UnderlinePen implements Product{
	private char ulchar;
	
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}
	public void use(String s) {
		int len = s.getBytes().length;
		System.out.println(ulchar + " " + s + " " + ulchar);
		for (int i = 0; i < len + 4; i++) {
			System.out.print(ulchar);
		}
		System.out.println();
	}
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
