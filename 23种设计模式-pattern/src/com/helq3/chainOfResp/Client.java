package com.helq3.chainOfResp;
/**
 * 测试
 */
public class Client {
	public static void main(String[] args) {
		Leader d = new Director("张三");
		Leader m = new Manager("李四");
		Leader g = new GeneralManager("王五");
		d.setNewLeader(m);
		m.setNewLeader(g);
		
		LeaveRequest request = new LeaveRequest("TOM",14,"回英国老家探亲");
		d.handleRequest(request);
	}
}
