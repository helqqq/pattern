package com.helq3.builder;
/**
 * 建造者实现类：建造需要的各个系统
 * @author Helena https://github.com/helqqq/pattern.git
 *
 */
public class SxtAirShipBuilder implements AirShipBuilder {
	//StringBuilder,XMLj解析中，JDOMDomBuilder,SaxBuilde
	public Engine buildEngine() {
		System.out.println("创建发动机！");//此处可以引用工厂模式
		return new Engine("庄子头牌发动机");
	}
	public EscapeTower buildEscapTower() {
		System.out.println("创建逃逸塔");
		return new EscapeTower("庄子头牌逃逸塔");
	}
	public OrbitalModule buildOrbitalModule() {
		System.out.println("创建轨道舱");
		return new OrbitalModule("庄子头牌轨道舱");
	}
}
