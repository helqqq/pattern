package com.helq3.templateMethod;
/**
 * 银行流程模板方法
 */
public abstract class BankTemplateMethod {
	public void takeNumber(){
		System.out.println("排队取号");
	}
	abstract void transact();//操作
	public void evaluate(){
		System.out.println("反馈评分");
	}
	//模板方法，把基本操作组合在一起，子类一般不能重写
	public final void process(){
		this.takeNumber();
		this.transact();//钩子函数：执行时，挂哪个子类的方法就执行哪个方法时
		this.evaluate();
	}
}
