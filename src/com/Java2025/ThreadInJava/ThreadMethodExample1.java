package com.Java2025.ThreadInJava;

class MyThread1 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
	}
}
public class ThreadMethodExample1 {
	public static void main(String args[]) throws InterruptedException {
		MyThread1 myThread = new MyThread1();
		myThread.start(); // Start the thread
		myThread.join(); // Wait for the thread to finish
		System.out.println("Thread finished Execution");
	}
}
