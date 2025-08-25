//package com.Java2025.oops;
//
////Runtime Polymorphism (Method Overriding)
////When a parent class and child class have same method name
////and the child class provides its own implementation of that method.
//
////The decision about which method to call is made at runtime based on the object type,
////not the reference type.
//
//class Animal{
//	void sound() {
//		System.out.println("Animal Make sound");
//	}
//}
//class Cat extends Animal{
//	void sound() {
//		System.out.println("Cat say meow-meow");
//	}
//}
//public class MethodOverridingRuntimePoly {
//	public static void main(String args[]) {
//		Animal c = new Cat();   //  Upcasting: reference is Animal, object is Cat
//		c.sound(); // parent method overide by child
//	}
//}
