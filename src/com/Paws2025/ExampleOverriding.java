package com.Paws2025;

class Animal{
	public void sound() {
		System.out.println("Animal make sound");
	}
}

class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("cat sound meo- meo");
	}
}

public class ExampleOverriding {
	public static void main(String args[]) {
		Animal a1 = new Cat();
		a1.sound();
	}

}
