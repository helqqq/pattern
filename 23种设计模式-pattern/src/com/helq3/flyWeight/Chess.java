package com.helq3.flyWeight;
/**
 * 享元模式：抽象对象围棋 FlyWeight
 */
public interface Chess {
	public String getColor();
	public void setColor(String color);
	void display(Coordinate c);
}
//具体享元类
class ConcreteChess implements Chess{
	private String color;
	public ConcreteChess(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void display(Coordinate c) {
		System.out.println("颜色："+this.color+",位置("+c.getX()+","+c.getY()+")");
	}
}
