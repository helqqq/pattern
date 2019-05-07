package com.helq3.memento;

import java.util.Stack;

/**
 * 负责人类
 * 持有备忘录对象
 */
public class CareTaker {
	private Memento memento;
//	private Stack<Memento> stack = new Stack<Memento>();//最好是容器类

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
