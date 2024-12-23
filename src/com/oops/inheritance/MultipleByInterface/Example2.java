package com.oops.inheritance.MultipleByInterface;

interface ClassA{
	default void show() {
		System.out.println("classA method");
	}
}

interface ClassB{
	default void show() {
		System.out.println("classB method");
	}
}

class ClassC implements ClassA, ClassB{
	 public void show() {
	        System.out.println("Calling methods from ClassA and ClassB:");
	        ClassA.super.show();
	        ClassB.super.show();
	        System.out.println("End of show method in ClassC.");
	}
}

public class Example2 {

	public static void main(String args[]) {
		ClassC obj = new ClassC();
		obj.show();
	}
}
