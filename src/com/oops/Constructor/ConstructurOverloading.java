package com.oops.Constructor;

class Student1{
	// data member
	int id;
	String name;
	int age;
	
	//constructor with two parameter
	
	Student1(int id, String name){
		this.id = id;
		this.name = name;
	}
	//constructor with three parameter
	Student1(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	//method to display the student's details
	void display() {
		System.out.println("Id: " +id+ ", Name: "+name+ ", Age: "+age);
	}
}

public class ConstructurOverloading {
	public static void main(String args[]) {
		Student1 s1 = new Student1(12,"mega");
		Student1 s2 = new Student1(12, "luke", 30);
		s1.display();
		s2.display();
	}

}
