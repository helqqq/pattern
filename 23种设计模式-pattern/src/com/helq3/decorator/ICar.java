package com.helq3.decorator;
/**
 * Componenet抽象组件
 */
public interface ICar {
	void move();
}
/**
 * ConcreteComponent 具体构件角色（真实角色）
 */
class Car implements ICar{
	public void move() {
		System.out.println("在陆地上跑");
	}
}
/**
 * Decorator 装饰角色
 */
class SuperCar implements ICar{
	private ICar car;
	
	public SuperCar(ICar car) {
		this.car = car;
	}
	public void move() {
		car.move();
	}
}
/**
 * ConcreteDecorator 装饰角色具体实现类
 */
class FlyCar extends SuperCar{
	public FlyCar(ICar car) {
		super(car);
	}
	@Override
	public void move() {
		super.move();
		fly();
	}
	public void fly(){
		System.out.println("天上飞");
	}
}
class WaterCar extends SuperCar{
	public WaterCar(ICar car) {
		super(car);
	}
	@Override
	public void move() {
		super.move();
		swim();
	}
	public void swim(){
		System.out.println("水里游...");
	}
}
class AICar extends SuperCar{

	public AICar(ICar car) {
		super(car);
	}
	@Override
	public void move() {
		super.move();
		speak();
	}
	public void speak(){
		System.out.println("智能的：会说话，会扫地，还会唱歌...");
	}
	
}
