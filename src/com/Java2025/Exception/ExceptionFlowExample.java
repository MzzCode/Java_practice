package com.Java2025.Exception;

public class ExceptionFlowExample {
	public static void main(String args[]) {
		
		try {
			method1();
		}
		catch(ArithmeticException e) {
			System.out.println("Handled in main: " + e.getMessage());
		}
	}
	
	public static void method1() {
		method2();
		try {
			method2();
		}catch(NullPointerException e) {
			System.out.println("Handled in method1: " + e.getMessage());
		}
	}
	
	public static void method2() {
		throw new ArithmeticException("Division by zero");
	}
}
