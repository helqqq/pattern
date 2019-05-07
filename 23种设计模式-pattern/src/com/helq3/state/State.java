package com.helq3.state;
/**
 * 状态接口类
 */
public interface State {
	void handle();
}
class FreeState implements State{
	@Override
	public void handle() {
		System.out.println("房间空闲，可以预定");
	}
}
class BookedState implements State{
	@Override
	public void handle() {
		System.out.println("房间已预定，不可以预定");
	}
}
class CheckInState implements State{
	@Override
	public void handle() {
		System.out.println("房间已入住，请勿打扰！！！");
	}
}
