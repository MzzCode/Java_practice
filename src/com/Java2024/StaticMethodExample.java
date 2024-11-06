package com.Java2024;

 public class StaticMethodExample {
	
	// static method
	
	static void displayName() {
		System.out.println("this is static method");
	}

	public static void main(String args[]) {
		// accessing static method
		displayName(); // this work only in same class
		StaticMethodExample.displayName(); // this is also way to access static method
		                                   // className.methodName 
	}
}
 
