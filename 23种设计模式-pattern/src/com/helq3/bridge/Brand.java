package com.helq3.bridge;
/**
 * 品牌：联想、Dell、神州、华硕、苹果
 */
public interface Brand {
	void sale();
}
class Lenovo implements Brand{
	public void sale() {
		System.out.println("销售联想电脑");
	}
}
class Dell implements Brand{
	public void sale() {
		System.out.println("销售dell电脑");
	}
}
class Shenzhou implements Brand{
	public void sale() {
		System.out.println("销售Shenzhou电脑");
	}
}
