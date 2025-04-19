package com.Java2025.ThreadInJava;

class SharedResourceInterTC {
	private int data;
	private boolean isProduced = false; // Flag to track production status

		// producer method
	 	public synchronized void produce(int value) {
	 		while(isProduced) { // If data is already produced, wait
	 			try {
	 				wait();
	 			}catch(InterruptedException e) {
	 				e.printStackTrace();
	 			}
	 		}
	 		data = value;
	 		isProduced = true;
	 		System.out.println("Produced: " + value);
	 		notify(); // Notify the consumer that data is ready
	 	}
	 	
	 	// consumer method
	 	public synchronized void consume() {
	 		while(!isProduced) { // if no data is produced wait
	 			try {
	 				wait();
	 			}catch(InterruptedException e) {
	 				e.printStackTrace();
	 			}
	 		}
	 		System.out.println("Consumed: " + data);
	 		isProduced = false;
	 		notify(); // Notify the producer that data is consumed
	 		
	 	}
}
	class Producer implements Runnable{
		
		// Constructor to accept shared resource
		
		private SharedResourceInterTC sharedResource;
		public Producer(SharedResourceInterTC sharedResource) {
			this.sharedResource = sharedResource;
		}
		public void run() {
			for(int i=1; i<=5; i++) { // produces exactly 5 values.
				sharedResource.produce(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
	}
	class Consumer implements Runnable{
		
		private SharedResourceInterTC sharedResource;
		public Consumer(SharedResourceInterTC sharedResource) {
			this.sharedResource = sharedResource;
		}
		public void run() {
			for(int i=0; i<5; i++) { // if i<=5 Consumer runs 6 times 
									  // Change Consumer loop condition from i<=5 to i<5 because 
									  // Consumer waits indefinitely for data that isn't produced.
									
				sharedResource.consume();
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
		public class InterThreadCommunicationExample {
	    public static void main(String[] args) {
	        SharedResourceInterTC sharedResource = new SharedResourceInterTC();
	        
	       // is an example of the Thread(Runnable target) constructor.
	        Thread producerThread = new Thread(new Producer(sharedResource));
	        Thread consumerThread = new Thread(new Consumer(sharedResource));

	        producerThread.start();
	        consumerThread.start();
	    }
	}