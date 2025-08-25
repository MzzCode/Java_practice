package com.Java2025.oops;

//Encapsulation 
class Person{
	
	// making the variable private: hidden from outside access
	private String name;
	private int age;
	
	
	// public getter and setter method
	// to access these variable
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class EncapsulationMain {
	public static void main(String args[]) {
		
		Person p = new Person();
		
		p.setName("mega wars");
		System.out.println("Name: " +p.getName());
		
		p.setAge(25);
		System.out.println("Age: " +p.getAge());
	}
	
}
