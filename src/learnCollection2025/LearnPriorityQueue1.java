package learnCollection2025;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue1 {
	
public static void main(String args[]) {
		
		// to change the default Min-Heap PQ to Max-Heap we need to pass comparator in constructor of PQ
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		pq.add(10);
		pq.add(5);
		pq.add(4);
		pq.add(20);
		pq.add(15);
		
		System.out.println("PQ after insertion : " +pq);
		
		// remove element from pq
		System.out.println("remove element from pq: " +pq.poll() 
		+"\npq after remove element" +pq);
	}

}
