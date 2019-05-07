package com.helq3.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 中介者角色 接口
 */
public interface Mediator {
	void regesiter(String dname,Department d);//注册部门
	void command(String dname);//发出命令
}
//中介者模式：中介者真实角色（总经理）
class President implements Mediator{
	Map<String,Department> map = new HashMap<String,Department>();
	public void regesiter(String dname, Department d) {
		map.put(dname, d);
	}

	public void command(String dname) {
		map.get(dname).selfAction();
	}
	
}