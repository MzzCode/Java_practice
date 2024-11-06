package com.Java2024;

public class MethodOverloadingExample {
	static String cube() {
		return "no parameter";
	}
	static int cube(int num) {
		
		int result = num*num*num;
		return result;
	}
	static double cube(double num) {
		double result = num*num*num;
		return result;
	}
	public static void main(String args[]) {
	
		System.out.println(cube());
		System.out.println("cube of 4 is: "+cube(4));
		System.out.println("cube of 6.5 is: "+cube(6.5));
	}
	
}
