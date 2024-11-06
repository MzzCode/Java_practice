package com.oops;

//Class Declaration

public class First {
	String name;
	String department;
	int roll_number;
	String Address;
	
// Constructor Declaration of Class
	First(String name, String department, int roll_number, String Address){
		this.name = name;
		this.department = department;
		this.roll_number = roll_number;
		this.Address = Address;
		
	}
	public String getName() { 
		return name; 
		}
	public String getDepartment() { return department; } 
	public int getRoll_number() { return roll_number; }
	public String getAddress() { return Address;}
	
	@Override public String toString() {
		return ("Student Name: " + this.getName()
		+"\nDepartment: " + this.getDepartment()
		+"\nRoll number: " +this.getRoll_number()
		+"\nAddress: " +this.getAddress());
	}
	public static void main(String args[]) {
		First Student = new First ("Mega Wars", " Information technology", 30, "New york ");
		System.out.println(Student.toString());
	}
	

}
