package com.helq3.builder;
/**
 * 客户端组建新的太空飞船
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class Client {
	public static void main(String[] args) {
		//组装者调用建造者，建造者调用工厂获取需要的各个系统
		SxtAirShipDirector director = new SxtAirShipDirector(new SxtAirShipBuilder());
		AirShip ship = director.directAirShip();//组装太空飞船
		System.out.println(ship.getEngine().getName());
		ship.launch();
	}
}
