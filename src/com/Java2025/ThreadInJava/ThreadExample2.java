package com.Java2025.ThreadInJava;

class MyThreadUsingImplements implements Runnable {
	public void run() {
		System.out.println("Thread by using runnable iterface");
	}
}

public class ThreadExample2 {
	public static void main(String args[]) {
		MyThreadUsingImplements myThread = new MyThreadUsingImplements();
		myThread.run();
	}

}
