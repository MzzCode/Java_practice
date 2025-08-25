package com.Java2025.oops;

class Animal{
	void sound() {
		System.out.println("animal make sound");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("cat say meow-meow");
	}
}
public class InhertanceMain {
	public static void main(String args[]) {
	Cat c  = new Cat();
	c.makeSound(); //own method
	c.sound(); // inherited method
	}
}
