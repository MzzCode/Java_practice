package com.garbagecollector;

public class Gcexample {
	public static void main(String args[]) {
	Gcexample obj = new Gcexample();
	
	// Now obj refers to the object
	
	obj = null; // Now no reference to the object
	
	// Requesting JVM to run Garbage Collector
	System.gc();
	
	System.out.println("End of main method");
	}
	
	protected void finalize() throws Throwable {
		System.out.println("Garbage collector called.. object is deletd! ");
	}
}
/*
We create an object obj

Then we make obj = null, meaning there is no link to the object anymore.

We request JVM to do garbage collection using System.gc();

When the object is deleted, finalize() method is automatically called, and it prints:
"Garbage Collector called. Object is deleted!

Output: Garbage collector called.. object is deletd! 
End of main method

Why is finalize() protected and not public?

finalize() method is defined inside Object class. And by default, it is marked as protected because
our own class override it and allowed to call it — not everyone from outside the class!

Now about throws Throwable ?
when JVM call finalize if any Exception occur JVM catch it handle it
And Throwable is parent of both Exception and Error in Java.
*/
