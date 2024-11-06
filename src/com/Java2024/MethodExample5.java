package com.Java2024;

public class MethodExample5 {
	
	static void displayInfo() {
		
		System.out.println("this is static method");
	}
	
	void displayinfo1() {
		System.out.println("this is non- static method");
	}
	public static void main(String args[]) {
		
		// accessing static method
		displayInfo();
		
		// accessing non-static method
		// creating instance of class
		
		MethodExample5 m = new MethodExample5();
		m.displayinfo1();
		
	}

}
