package com.Java2025.Exception;

public class FinallyExample2 {
	public static void main(String args[]) {
		try {
			System.out.println("inside try block");
			int data = 10/0; // This will throw ArithmeticException
		}finally {
			System.out.println("Finally block executed");
		}
		System.out.println("code after try-finally"); // This line won't execute due exception
	}
}

