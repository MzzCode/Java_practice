package com.oops.Constructor;

class Person{
	String name; 
	int age;
}
public class DefaultConstructor {
public static void main(String[] args) {
	Person p1 = new Person();// Create a new Person object using the default constructor
	System.out.println("Name: " +p1.name); // Printing the default value of name
	System.out.println("Age: " +p1.age); // Printing the default value of age
}
}
