package com.helq3.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式：抽象静态工厂
 */
public class ChessFactory {
	private static Map<String,Chess> map = new HashMap<String,Chess>();
	public static Chess getChess(String color){
		if(map.containsKey(color)){
			return map.get(color);
		}else{
			ConcreteChess c = new ConcreteChess(color);
			map.put(color, c);
			return c;
		}
	}
}
