package com.helq3.builder;
/**
 * ��װׯ��ͷ��̫�շɴ�
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class SxtAirShipDirector implements AirShipDirector{
	private AirShipBuilder builder;
	
	public SxtAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}
	public AirShip directAirShip() {
		AirShip ship = new AirShip();
		ship.setEngine(builder.buildEngine());
		ship.setEscapeTower(builder.buildEscapTower());
		ship.setOrbitalModule(builder.buildOrbitalModule());
		return ship;
	}
}
