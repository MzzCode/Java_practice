package com.Java2025.ThreadInJava;

public class ThreadStatesExample {
	public static void main(String args[]) throws InterruptedException {
		
		// Thread instance created, but not started (NEW state)
		Thread thread = new Thread(new Task());
		System.out.println("thread state after creation: " +thread.getState());
		
		// Start the thread (RUNNABLE state)
		thread.start();
		System.out.println("Thread state after start: " +thread.getState());
		
		// Let the thread sleep for a moment to observe TIMED_WAITING
		thread.sleep(5000);
		System.out.println("Thread State while sleeping: " +thread.getState());
		
		// Use a synchronized block to observe BLOCKED state
		Thread blockerThread = new Thread(new BlockerThread());
		blockerThread.start();
		thread.sleep(1000); // Ensure blockerThread tries to acquire the lock
		System.out.println("BlockerThread State while waiting for lock: " + blockerThread.getState());
		
		// Join the main thread to observe WAITING or TIMED_WAITING
		thread.join();
		System.out.println("Thread state after completion: " +thread.getState());
		
	}
}
class Task implements Runnable {

	static final Object lock = new Object();
	@Override
	public void run() {
		try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " is RUNNING");
                Thread.sleep(10000); // Simulates work and goes into TIMED_WAITING
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class BlockerThread implements Runnable {
	
	@Override
	public void run() {
		synchronized (Task.lock) {
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
        }
	}

}


