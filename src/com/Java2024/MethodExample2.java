package com.Java2024;

public class MethodExample2 {
	int a = 20;
	static int b= 30;
	static int c = 40;
	
	void mulInput() {
		System.out.println("Enter your 2nd number: " +b);
		System.out.println("Enter your 3rd number: " +c);
	}
	
	// Static method to multiply static variables b and c
	
	static void mul() {
		int mulNum = b*c;
		System.out.println("multiplication of number is: " +mulNum);
		
	}
	
	public static void main(String args[]) {
		
		// Call to the static method 'mul' using the class name, without creating an object
		// we did not create an object of the class MethodExample2 
		//because we are working with static methods and variables.
		MethodExample2.mul();
		
		// for access non-static method we need to make object of class
		// for e.g access of mulInput() non static method
		MethodExample2 m = new MethodExample2();
		m.mulInput();
	}

}


