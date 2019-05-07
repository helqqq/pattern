package com.helq3.chainOfResp;

public class Director extends Leader{

	public Director(String name) {
		super(name);
	}
	public void handleRequest(LeaveRequest request) {
		if(request.getDays() < 3){
			System.out.println("员工："+request.getName()+"，请假"+request.getDays()+"天，理由："+request.getReason());
			System.out.println("主任："+this.name+"，审批通过。");
		}else{
			if(this.nextLeader != null){
				this.nextLeader.handleRequest(request);//本级无权，送领导审批
			}
		}
	}
}
class Manager extends Leader{

	public Manager(String name) {
		super(name);
	}
	public void handleRequest(LeaveRequest request) {
		if(request.getDays() < 15){
			System.out.println("员工："+request.getName()+"，请假"+request.getDays()+"天，理由："+request.getReason());
			System.out.println("经理："+this.name+"，审批通过。");
		}else{
			if(this.nextLeader != null){
				this.nextLeader.handleRequest(request);//本级无权，送领导审批
			}
		}
	}
}
class GeneralManager extends Leader{

	public GeneralManager(String name) {
		super(name);
	}
	public void handleRequest(LeaveRequest request) {
		if(request.getDays() < 30){
			System.out.println("员工："+request.getName()+"，请假"+request.getDays()+"天，理由："+request.getReason());
			System.out.println("总经理："+this.name+"，审批通过。");
		}else{
			System.out.println("请假天数超纲，驳回");
		}
	}
}