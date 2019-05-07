package com.helq3.chainOfResp;
/**
 * 封装请假条的基本信息
 */
public class LeaveRequest {
	private String name;//请假人
	private int days;//请多少天
	private String reason;//请假理由
	
	public LeaveRequest(String name, int days, String reason) {
		this.name = name;
		this.days = days;
		this.reason = reason;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
