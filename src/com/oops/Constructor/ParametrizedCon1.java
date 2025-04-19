package com.oops.Constructor;

class Student{
	// Instance variables or Data Member to store student ID and name
	int id;
	String name;

	// Parameterized constructor to initialize instance variables when object is created 
 Student(int id, String name){
	this.id = id;  // Setting value for instance variable 'id'
	this.name = name;
   
}
//Method to display the student details
   void display() {
	   System.out.println("Id: " +id+ ", Name: "+name);
   }
}
public class ParametrizedCon1 {
	public static void main(String[] args) {
		
		// Creating objects with different values
		Student s1 = new Student(20, "mega"); 
		Student s2 = new Student(5, "jhon deo");
		
		
		// Creating object with same values as s1
		Student s3 = new Student(20, "mega");
		
		// Displaying details
				s1.display();
				s2.display();
				s3.display();
	}
}
