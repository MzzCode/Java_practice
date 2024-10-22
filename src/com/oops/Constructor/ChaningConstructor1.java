package com.oops.Constructor;

class Person2{
	String name;
	int id;
//constructor
	Person2(String name, int id){
	this.name = name;
	this.id = id;
}
}

class Employee1 extends Person2{
	Employee1(String name, int id){
		
	//super(name);
	//super(id);
		
/*the super keyword gives error: When you invoke the super() constructor, it should be done only once, 
and it should include all the necessary parameters that the parent class's constructor requires.
In your code, you've used super(name) and super(id) separately, which is incorrect.
*/
		//correct way
		super(name, id); // Call to the superclass constructor with both parameters
	}
 
	void display() {
		System.out.println("Name: " +name+ ", Id: "+id);
	}
}

public class ChaningConstructor1 {
public static void main(String args[]) {
	Employee1 emp1 = new Employee1("Mega", 5);
	emp1.display();
}
}
