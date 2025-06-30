package com.Java2025.functionalinterface;

@FunctionalInterface
interface MyFunctionalInterface {
    void sayHello();  // Only one abstract method
}

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
        MyFunctionalInterface greet = () -> System.out.println("Hello from lambda!");
        greet.sayHello();
    }
}
