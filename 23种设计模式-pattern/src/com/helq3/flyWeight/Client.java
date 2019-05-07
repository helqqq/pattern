package com.helq3.flyWeight;
/**
 * 享元模式：FlyWeight  String就是享元模式
 */
public class Client {
	public static void main(String[] args) {
		Chess c1 = ChessFactory.getChess("黑色");
		Chess c2 = ChessFactory.getChess("黑色");
		System.out.println(c1);
		System.out.println(c2);
		c1.display(new Coordinate(10,10));
		c2.display(new Coordinate(20,3)); 
		
		String s1 = "112";
		String s2 = "112";
		String s3 = "11"+"2";
		String s4 = new String("211");
		String s5 = "11";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
	}
}
