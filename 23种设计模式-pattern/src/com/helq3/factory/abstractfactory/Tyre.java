package com.helq3.factory.abstractfactory;

public interface Tyre {
	void revolve();
}
class LowTyre implements Tyre{
	public void revolve() {
		System.out.println("磨损快");
	}
}
class LuxuryTyre implements Tyre{
	public void revolve() {
		System.out.println("基本没有磨损");
	}
}
