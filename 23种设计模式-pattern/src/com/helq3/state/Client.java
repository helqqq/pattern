package com.helq3.state;
/**
 * ≤‚ ‘
 */
public class Client {
	public static void main(String[] args) {
		RoomContext rc = new RoomContext(new FreeState());
		rc.setState(new BookedState());
		rc.setState(new CheckInState());
	}
}
