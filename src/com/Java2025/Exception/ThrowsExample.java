package com.Java2025.Exception;

public class ThrowsExample {
	public static int divideNum(int m,int n) throws ArithmeticException{
		int div = m/n;
		return div;
	}
public static void main(String args[]) {
	ThrowsExample obj = new ThrowsExample();
	try {
		System.out.println(obj.divideNum(50, 0));
	}catch(ArithmeticException e) {
		System.out.println("Error: Number can not divided by zero");
	}
	System.out.println("program continue....");
}
}
