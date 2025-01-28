package com.Java2025.Exception;

public class ArithmeticExceptionExample {
	public static void main(String args[]) {
	int a =10;
	int b =0;
	try {
	int result = a/b;
	System.out.println(result);
	}
	catch (ArithmeticException e) {
		System.out.println("Error: Division by zero is not allowed."); 
	}
	System.out.println("program continue....");
	}
}
