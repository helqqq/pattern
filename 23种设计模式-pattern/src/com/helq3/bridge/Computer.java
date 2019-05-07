package com.helq3.bridge;
/**
 * 
 */
public abstract class Computer {
	protected Brand brand;
	public Computer(Brand brand) {
		this.brand = brand;
	}
	void sale(){
		this.brand.sale();
	}
}
class Laptop extends Computer{
	public Laptop(Brand brand) {
		super(brand);
	}
	void sale(){
		super.sale();
		System.out.println("销售笔记本");
	}
}
class Desktop extends Computer{

	public Desktop(Brand brand) {
		super(brand);
	}
	void sale() {
		super.sale();
		System.out.println("销售台式机");
	}
}
class Pad extends Computer{
	public Pad(Brand brand) {
		super(brand);
	}
	void sale() {
		super.sale();
		System.out.println("销售Pad");
	}
	
}
