package com.Java2025.ThreadInJava;

class MyThread extends Thread{
	public void run() {
	     System.out.println("Thread is running");
	}
}

public class ThreadExample {
	public static void main(String args[]) {
		MyThread myThread = new MyThread();
		myThread.start();
	}
}