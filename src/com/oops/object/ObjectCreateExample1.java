package com.oops.object;

// 1. Using new Keyword
class Employee{
	int id;
	String name;
	String department;
	
	//Employee class Constructor to initialize Employee object with id, name, and department
	Employee(int id, String name, String department){
		this.id = id;
		this.name = name;
	 	this.department = department;
		}
	// Method to display employee details
	void display() {
		System.out.println("Id: " +id+ ", name: "+name+ ", department: " +department);
		}
	}

public class ObjectCreateExample1 {
 public static void main(String[] args) {
	
	 // Creating an Employee object using the new keyword
	Employee e1 = new Employee(1, "mega", "IT");
	  
	// Displaying the details of the Employee object
	e1.display();
}
	

}
