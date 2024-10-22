package com.Java2024;

abstract class AbstractExample{
	// abstract method
	abstract void giveName(String name);
}

public class AbstractMain extends AbstractExample {
	public static void main(String args[]) {
		AbstractMain obj = new AbstractMain();
		obj.giveName("mega wars");
		
	}
	// Provide an implementation of the abstract method
	@Override //optional: 
	void giveName(String name) {
		System.out.println("name is: "+name);
	}

}
