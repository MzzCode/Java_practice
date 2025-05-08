package learnCollection2025;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
	
	public static void main(String args[]) {
		
		// By default it is Min-Heap PQ
		Queue<Integer> pq = new PriorityQueue<>();
		
		pq.add(10);
		pq.add(5);
		pq.add(4);
		pq.add(20);
		pq.add(15);
		
		System.out.println("PQ after insertion : " +pq);
		
		// for get first elemet without removing it
		System.out.println("Get first elemet: " +pq.peek());
		
		// remove element from pq
		System.out.println("remove element from pq: " +pq.poll() 
		+"\npq after remove element" +pq);
		
		// remove specific element return boolean  
		System.out.println("remove sepcific elemet: " +pq.remove(10) // found true
		+"\npq after removing specific elemet: " +pq);
		
		System.out.println("remove sepcific elemet: " +pq.remove(10)); // not-found false
		
		// size
		System.out.println("Size of pq: " +pq.size());
		
	}

}
