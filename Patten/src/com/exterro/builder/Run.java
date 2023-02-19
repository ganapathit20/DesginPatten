package com.exterro.builder;

public class Run {

	public static void main(String[] args) {
		
	Mobile mobile = new BuilderPatten().setName("vivo").setPrice(1000).getPhone();
	
	System.out.println(mobile);
	
	}

}
