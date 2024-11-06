package com.oops.Constructor;

class Employee{
	// data member
	int id;
	String name;
	String address;
	
	// Parameterized constructor
	Employee(int id, String name, String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	// Copy constructor to create a new Employee object as a copy of an existing Employee object.
	//Creates a new Employee object as a copy of an existing Employee object (info).
	//It initializes the new object's instance variables with the values from the existing object.
	Employee(Employee info){
		this.id = info.id; // Copy the value from the existing object
		this.name = info.name;
		this.address = info.address;
	}
}
public class CopyConstructor {
	public static void main(String args[]) {

System.out.println("First object");		

//Creating the first Employee object using the parameterized constructor.
Employee e1 = new Employee(1,"mega wars", "new york");
System.out.println("ID: "+e1.id+ ", Name: "+e1.name+ ", Address: "+e1.address);

//Creates a new Employee object e2 as a copy of the e1 object using the copy constructor. 
//This means e2 will have the same id, name, and address as e1.

Employee e2 = new Employee(e1);
System.out.println("\nSecond object by copy constructor");
System.out.println("ID: "+e2.id+ ", Name: "+e2.name+ ", Address: "+e2.address);
}
}