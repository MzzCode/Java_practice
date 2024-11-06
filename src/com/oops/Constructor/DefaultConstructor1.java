package com.oops.Constructor;

class Person1{
	String name; 
	int age;
}
public class DefaultConstructor1 {
public static void main(String[] args) {
	Person1 p1 = new Person1();// Create a new Person object using the default constructor
	
	// Manually set the fields
	p1.name ="Mega";
	p1.age = 29;
	
	// Print the name and age
	System.out.println("Name: " +p1.name);
	System.out.println("Age: " +p1.age);
}
}
