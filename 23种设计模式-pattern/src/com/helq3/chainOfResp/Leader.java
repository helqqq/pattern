package com.helq3.chainOfResp;
/**
 * 领导抽象类
 */
public abstract class Leader {
	protected String name;//领导名称
	protected Leader nextLeader;//责任链的后续对象，即领导的领导
	
	public Leader(String name) {
		this.name = name;
	}
	public void setNewLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	public abstract void handleRequest(LeaveRequest request);
}
