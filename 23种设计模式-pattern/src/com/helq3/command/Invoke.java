package com.helq3.command;
/**
 * 命令发起者
 * @author Helena
 */
public class Invoke {
	private Command co;  //也可以使用List<Command> 
	public Invoke(Command co) {
		this.co = co;
	}
	public void call(){
		co.execute();
	}
}
