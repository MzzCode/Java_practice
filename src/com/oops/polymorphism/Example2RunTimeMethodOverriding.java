package com.oops.polymorphism;

class Animal{
	void sound() {
		System.out.println("Animals make sound");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("cat say meow- meow");
	}
}

public class Example2RunTimeMethodOverriding {
	public static void main (String args[]) {
	Animal animal = new Cat();// Upcasting
	animal.sound(); // here override the method of parent class with child class
	}
}
/*
 * We are calling the `sound` method by the reference variable of the Parent class (`Animal`).
 * Since the reference refers to the subclass object (`Cat`) and the subclass method overrides
 * the Parent class method, the subclass method is invoked at runtime.
 * Method invocation is determined by the JVM (not the compiler), so this is known as runtime polymorphism.
 */

