package com.Java2025.oops;

//interface
interface Vehicle{
	void start();
}
class Car implements Vehicle{

		public void start() {
		System.out.println("car starts...");
	}
}

public class SimpleInterfaceExample {
	public static void main(String args[]) {
	
		Vehicle c = new Car();
		c.start();
	}
}
