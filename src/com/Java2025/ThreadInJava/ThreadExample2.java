package com.Java2025.ThreadInJava;

class MyThreadUsingImplements implements Runnable {
	public void run() {
		System.out.println("Thread by using runnable iterface");
	}
}
public class ThreadExample2 {
	public static void main(String args[]) {
		MyThreadUsingImplements myThread = new MyThreadUsingImplements();
		
		//myThread.run();  we don’t use .run because we simply call a method of java 
						// we must start a thread but we can't directly call start()
						// This causes a compilation error because the start() method 
						// belongs to the Thread class, not the Runnable interface.

		// To fix this pass the Runnable instance to the constructor of the Thread class
		// then call the start() method of the Thread object.
		
		Thread thread = new Thread(myThread);
		thread.start();
	}
}
