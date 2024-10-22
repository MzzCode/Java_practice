package com.oops.Constructor;

class Student{
	// Instance variables or Data Member to store student ID and name
	int id;
	String name;

	// Parameterized constructor to initialize the Student object with an ID and name
 Student(int id, String name){
	this.id = id;
	this.name = name;
   
}
//Method to display the student details
   void display() {
	   System.out.println("Id: " +id+ ", Name: "+name);
   }
}
public class ParametrizedCon1 {
	public static void main(String[] args) {
		Student s1 = new Student(20, "mega"); 
		Student s2 = new Student(5, "jhon deo"); 
				s1.display();
				s2.display();
	}

}
