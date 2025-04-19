package com.Java2025.ThreadInJava;

class MyThread2 implements Runnable{
	public void run() {
		System.out.println("Thread Detail -> Name: "+Thread.currentThread().getName() 
				+ ", Priority " +Thread.currentThread().getPriority()
				+ ", State " +Thread.currentThread().getState());
	}
}
public class ThreadMethodPriorityExample2{
	public static void main(String args[]) {
		Thread myThread = new Thread(new MyThread2());
		
		myThread.setName("HighprirotyThread"); // customize thread name by .setName()
		
		myThread.setPriority(Thread.MAX_PRIORITY);
		myThread.start();
		System.out.println("priorty of "+myThread.getName() +" : " 
		+myThread.getPriority());
	}
}

