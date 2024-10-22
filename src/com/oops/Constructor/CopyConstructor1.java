package com.oops.Constructor;

//Copying values without constructor
class Student2{
	String name;
	String address;
	
	//constructor
	Student2(String name, String address){
		this.name = name;
		this.address = address;
	}
	// Default constructor with no parameters
	Student2(){
		}
	void display() {
		System.out.println("Name: "+name+ ", Address: "+address);
	}
	}

public class CopyConstructor1 {
	public static void main(String[] args) {
	
		// by parametrized constructor
	Student2 s1 = new Student2("Mega wars", "new york");
	
	// Create the second Student2 object using the default constructor
	Student2 s2 = new Student2();
	
	// Manually copy values from s1 to s2
	s2.name = s1.name;
	s2.address = s1.address;
	
	//Calling the display method
	s1.display();
	s2.display();
	}
}
