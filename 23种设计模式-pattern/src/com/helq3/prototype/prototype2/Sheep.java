package com.helq3.prototype.prototype2;

import java.io.Serializable;
import java.util.Date;

/**
 * 原型模式：浅克隆
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Sheep implements Cloneable,Serializable{
	private String sname;
	private Date birthday;
	public Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		return obj;
	}
	
	public Sheep(String sname, Date birthday) {
		this.sname = sname;
		this.birthday = birthday;
	}

	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
