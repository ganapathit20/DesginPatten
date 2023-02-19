package com.exterro.builder;

public class BuilderPatten {

	private String name;
	private int price;
	private String bettery;
	private int ram;
	
	public BuilderPatten setName(String name) {
		this.name = name;
		return this;
	}

	public BuilderPatten setPrice(int price) {
		this.price = price;
		return this;
	}

	public BuilderPatten setBettery(String bettery) {
		this.bettery = bettery;
		return this;
	}

	public BuilderPatten setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public Mobile getPhone() {
		return new Mobile(name, price, bettery, ram);
	}
	
	
}
