package com.oops.Constructor;

class User{
	String name;
	int Balance;
	
	public User(String name, int Balance) {
		this.name = name;
		this.Balance = Balance;
	}
	
	void Display() {
		System.out.println("User name: " +name + " Balance: " +Balance);
	}
}


public class ParCon2 {
public static void main(String args[]) {
	User u1 = new User("Alice jhon", 300000);
	u1.Display();
}
}
