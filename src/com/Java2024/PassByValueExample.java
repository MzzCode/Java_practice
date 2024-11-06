package com.Java2024;

public class PassByValueExample {

	int data = 50; //Instance variable 'data'
	
	/*In Java, a local variable is a variable that is declared within a method, constructor, 
	or block of code. It is only accessible within that specific method, constructor, or block, 
	and it gets destroyed once the method execution is complete.
	
	A parameter is a special kind of local variable that is declared in the method signature and 
	initialized with the value provided by the caller of the method when the method is invoked.
	*/
	void changes(int data) { 
		data = data+100; // This 'data' is the local parameter, not the instance variable
		System.out.println("Changes in the local variable only: "+data );
	}

/* int data in the method signature:

The data in void changes(int data) is a parameter. It is considered a local variable because it is only accessible within the changes method.
When you call p.changes(500); in your main method, the value 500 is passed to the changes method, and the parameter data is initialized with this value.

Why is it local?

Scope: The scope of the data parameter is limited to the changes method. You cannot access this data outside of the changes method.
Lifetime: The parameter data only exists during the execution of the changes method. Once the method completes execution, the data parameter is discarded.
	*/
	public static void main(String args[]) {
		PassByValueExample p = new PassByValueExample(); // creating instance of class for access instance variable.
		System.out.println("Before changes: " +p.data);
		
		p.changes(500); // Passes 500 to 'changes' method
		
		System.out.println("After changes: " +p.data);
		
//The instance variable data remains unchanged because the method parameter data (local to changes) 
//does not refer to the instance variable data; it only holds the value passed during the method call.
	}
}
