package com.helq3.state;
/**
 * 房间类，很重要
 */
public class RoomContext {
	private State state;
	public RoomContext(State state) {
		this.state = state;
	}
	public void setState(State state) {
		System.out.println("切换状态");
		this.state = state;
		state.handle();
	}
}
