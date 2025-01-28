package com.Java2025.Exception;

public class FinallyExample {
	public static void main(String args[]) {
		try {
			System.out.println("Inside try block");
			int data = 10/0;
		}catch(Exception e) {
			System.out.println("Exception caught: " + e.toString());
		}
		finally {
			System.out.println("Finally block executed");
		}
		System.out.println("code after try-catch-finally");
	}
}
