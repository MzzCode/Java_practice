package com.Java2025.functionalinterface;

@FunctionalInterface

interface MyFunctionalInterface2{
	void sayHello();
}

class MyClass implements MyFunctionalInterface{
	@Override
	public void sayHello() {
		System.out.println("Hello from other class implementation");
	}
}
public class FunctionalInterfaceExample2 {
	public static void main(String args[]) {
		MyFunctionalInterface greet = new MyClass();
		greet.sayHello();
	}
}
