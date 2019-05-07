package com.helq3.memento;

public class Client {
	public static void main(String[] args) {
		//建立一个源发器
		Emp emp = new Emp("高淇",900,18);
		//负责人持有备份对象
		CareTaker ct = new CareTaker();
		ct.setMemento(emp.memento());//进行备份操作
		
		System.out.println("第一次打印："+emp.getEname()+","+emp.getAge()+","+emp.getSalary());
		//修改源发器
		emp.setAge(22);
		emp.setEname("Helena");
		emp.setSalary(8200);
		System.out.println("第二次打印："+emp.getEname()+","+emp.getAge()+","+emp.getSalary());
		//恢复到第一次
		emp.recovery(ct.getMemento());
		System.out.println("第三次打印："+emp.getEname()+","+emp.getAge()+","+emp.getSalary());
		
		
	}
}
