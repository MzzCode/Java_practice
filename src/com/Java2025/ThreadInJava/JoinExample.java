package com.Java2025.ThreadInJava;

class MyJoinExample implements Runnable{
	public void run() {
		for(int i=0; i<=2; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
public class JoinExample{
	public static void main(String args[]) {
		
		MyJoinExample myJoinObj = new MyJoinExample();
		Thread t1 = new Thread(myJoinObj);
		Thread t2 = new Thread(myJoinObj);
		
		t1.start();
		try {
			t1.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		try {
			t2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread executed");
		
	}
}
