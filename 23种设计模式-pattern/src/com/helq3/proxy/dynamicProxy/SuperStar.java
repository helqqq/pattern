package com.helq3.proxy.dynamicProxy;
/**
 * ��ʵ��ɫ����������
 */
public class SuperStar implements Star{

	@Override
	public void confer() {
		System.out.println("---confer");
		
	}

	@Override
	public void signContract() {
		System.out.println("--signContract");
	}

	@Override
	public void bookTicket() {
		System.out.println("--bookTicket");
	}

	@Override
	public void sing() {
		System.out.println("�ܽ��ױ��˳�����");
	}

	@Override
	public void collecMoney() {
		System.out.println("----collecMoney");
	}

}
