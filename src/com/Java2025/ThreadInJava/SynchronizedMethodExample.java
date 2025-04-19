package com.Java2025.ThreadInJava;

class SharedResourcesInterTC implements Runnable{
	public synchronized void printNum(int n) {
		for(int i = 1; i<=5; i++) {
			System.out.println(n*i);
		}
		try {
			Thread.sleep(10000); // Makes synchronization effects clearer
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
public void run() {
 printNum(5);	
}
}
public class SynchronizedMethodExample {
public static void main(String[] args) {
	SharedResourcesInterTC sharedResource = new SharedResourcesInterTC(); // Single shared instance
	Thread obj = new Thread(sharedResource);
	obj.start();
	Thread obj1 = new Thread(sharedResource);
	obj1.start();
	Thread obj2 = new Thread (sharedResource);
	obj2.start();
}
}
