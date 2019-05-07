package com.helq3.prototype.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {
	private Map showcase = new HashMap();
	public void register(String name,Product prototype){
		showcase.put(name, prototype);
	}
	public Product create(String protoname){
		Product p = (Product) showcase.get(protoname);
		return p.createClone();
	}
}
