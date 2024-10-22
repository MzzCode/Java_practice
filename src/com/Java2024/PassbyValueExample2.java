package com.Java2024;

public class PassbyValueExample2 {
	
    int data = 100;
	
	 void changes(PassbyValueExample2 p) { 
// This method will take an object reference and modify the 'data' variable of that object.
		
		 p.data = p.data+200; 
// changes in instance variable
// This statement modifies the 'data' field of the object passed as an argument.
// It adds 200 to the current value of 'data' in the passed object.
	}
	
	public static void main(String args[]) {
		PassbyValueExample2 p = new PassbyValueExample2();
		System.out.println("before method call: "+p.data);

		p.changes(p);
		// The 'changes' method is called with 'p' as the argument.
        // This passes the reference of the object 'p' to the method.
        // Inside the 'changes' method, the 'data' field of the object 'p' is modified.
		
		System.out.println("after method call: " +p.data);
		 // This prints the value of the 'data' field after calling the 'changes' method.
	}

}
