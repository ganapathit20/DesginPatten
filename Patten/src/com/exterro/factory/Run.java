package com.exterro.factory;

public class Run {

	public static void main(String[] args) {
		
		ObjectFactory of = new ObjectFactory();

		IOs os = of.getMobile("apple");
		os.getDetails();
	}

}
