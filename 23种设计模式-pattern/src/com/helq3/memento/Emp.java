package com.helq3.memento;
/**
 * 源发器类
 */
public class Emp {
	private String ename;
	private double salary;
	private int age;
	//持有备忘录类
	//进行备份操作，并返回备忘录对象
	public Memento memento(){
		return new Memento(this);
	}
	//进行数据恢复
	public void recovery(Memento mmt){
		this.ename = mmt.getEname();
		this.salary = mmt.getSalary();
		this.age = mmt.getAge();
	}
	
	public Emp(String ename, double salary, int age) {
		this.ename = ename;
		this.salary = salary;
		this.age = age;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
