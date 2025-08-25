package com.Java2025.oops;
// compile time Polymorphism (method overloading)
//same method name but different parameter
// can be different return type also (int, double, float)
class Calculator{
	
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	double add(double a, double b) {
		return a+b;
	}
}
public class MethodOverloadingPolyMain {
	
	public static void main(String args[]) {
		
		Calculator c = new Calculator();
		
		System.out.println(c.add(2, 5));
		System.out.println(c.add(2,5,3));
		System.out.println(c.add(2.0, 5.0));
	}
}
