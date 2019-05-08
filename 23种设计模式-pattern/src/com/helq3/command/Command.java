package com.helq3.command;
/**
 * ÃüÁî½Ó¿Ú
 * @author Helena
 */
public interface Command {
	void execute();
}
class ConcreteCommand implements Command{
	private Receiver receiver;
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	public void execute() {
		receiver.action();
	}	
}
