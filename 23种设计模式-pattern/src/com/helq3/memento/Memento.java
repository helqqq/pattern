package com.helq3.memento;
/**
 * ±¸ÍüÂ¼Àà
 */
public class Memento {
	private String ename;
	private double salary;
	private int age;
	public Memento(Emp emp) {
		this.salary = emp.getSalary();
		this.age = emp.getAge();
		this.ename = emp.getEname();
	}
	public Memento(String ename, double salary, int age) {
		this.salary = salary;
		this.age = age;
		this.ename = ename;
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
