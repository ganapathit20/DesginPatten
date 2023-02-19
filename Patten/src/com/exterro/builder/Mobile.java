package com.exterro.builder;

public class Mobile {
	
	private String name;
	private int price;
	private String bettery;
	private int ram;
	
	public Mobile(String name, int price, String bettery, int ram) {
		super();
		this.name = name;
		this.price = price;
		this.bettery = bettery;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + ", bettery=" + bettery + ", ram=" + ram + "]";
	}
	
	
	
	

}
