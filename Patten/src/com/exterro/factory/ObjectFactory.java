package com.exterro.factory;

public class ObjectFactory {
	
	public IOs getMobile(String mobile) {
		
		if(mobile.equals("windows"))
			return new Windows();
		else if(mobile.equals("apple"))
			return new Apple();
		else
			return null;
		
	}

}
