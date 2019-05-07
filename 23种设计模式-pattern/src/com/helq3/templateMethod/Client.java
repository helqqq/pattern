package com.helq3.templateMethod;
/**
 * 测试
 */
public class Client {
	public static void main(String[] args) {
		BankTemplateMethod btm = new CarryMoney();
		btm.process();
		System.out.println("-------------");
		//匿名内部类
		BankTemplateMethod btm2 = new BankTemplateMethod(){
			@Override
			void transact() {
				System.out.println("存款...");
			}
		};
		btm2.process();
	}
}
class CarryMoney extends BankTemplateMethod{
	@Override
	void transact() {
		System.out.println("取款...");
	}
}
