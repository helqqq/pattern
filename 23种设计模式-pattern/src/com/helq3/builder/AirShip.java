package com.helq3.builder;

public class AirShip {
	private Engine Engine;//发动机
	private OrbitalModule orbitalModule;//轨道舱
	private EscapeTower escapeTower;//逃逸塔
	
	public void launch(){
		System.out.println("发射！！！");
	}
	public Engine getEngine() {
		return Engine;
	}
	public void setEngine(Engine engine) {
		Engine = engine;
	}
	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}
	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}
	public EscapeTower getEscapeTower() {
		return escapeTower;
	}
	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
	
}
class Engine{
	private String name;

	public Engine(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class OrbitalModule{
	private String name;
	public OrbitalModule(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class EscapeTower{
	private String name;
	public EscapeTower(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}