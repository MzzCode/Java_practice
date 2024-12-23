package com.oops.polymorphism;

class Calculator{
	static int add(int a, int b) 
	{
	return a+b;
	}
	
	static double add(double a, double b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
		
	}
}

public class Example1CompileTimeMethodOverloading {
	public static void main(String args[]) {
		System.out.println(Calculator.add(60, 40)); //Calls int add(int, int)
		System.out.println(Calculator.add(20.10, 10.5)); // Calls double add(double, double)
		System.out.println(Calculator.add(20, 10, 30)); // Calls int add(int, int, int)
	}
}
     