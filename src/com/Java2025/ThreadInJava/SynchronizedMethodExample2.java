package com.Java2025.ThreadInJava;

class SharedResourceBySyncBlock implements Runnable{
	
	static final Object Task = new Object();
	private  static boolean methodCalled = false; // Flag to ensure otherMethod is called only once
	public void printNum(int n) {
		synchronized (Task) {
			for(int i =1; i<=4; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + n*i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	}

		//Another non-synchronized method to show concurrent execution
		public void otherMethod() {
			if(!methodCalled)
		System.out.println(Thread.currentThread().getName() + " is executing otherMethod()");
			methodCalled = true;
	}
		
	public void run() {
		printNum(2);
		otherMethod();
	}
}
public class SynchronizedMethodExample2 {
	public static void main (String args[]) throws InterruptedException {
		SharedResourceBySyncBlock sharedBySync = new SharedResourceBySyncBlock();
		
		Thread th = new Thread(sharedBySync);
		Thread th1 = new Thread(sharedBySync);
		Thread th2 = new Thread(sharedBySync);
		
		th.start();
		th1.start();
		th2.start();
		
		th.join();
		th1.join();
		th2.join();
	}
}