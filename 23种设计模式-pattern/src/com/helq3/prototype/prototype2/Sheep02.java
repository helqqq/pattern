package com.helq3.prototype.prototype2;

import java.util.Date;

/**
 * 原型模式：深克隆
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Sheep02 implements Cloneable{
	private String sname;
	private Date birthday;
	public Sheep02 clone() throws CloneNotSupportedException {
		Sheep02 sheep = (Sheep02) super.clone();
		sheep.birthday = (Date) this.birthday.clone();
		return sheep;
	}
	
	public Sheep02(String sname, Date birthday) {
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
