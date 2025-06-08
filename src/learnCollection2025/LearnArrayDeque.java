package learnCollection2025;

import java.util.ArrayDeque;
import java.util.Queue;

public class LearnArrayDeque {
	public static void main(String args[]) {
		
		Queue<String> arrayDeque = new ArrayDeque<>(); {
			
			arrayDeque.add("a"); // For queues, it's generally better to use offer() instead of add()
			
			arrayDeque.offer("b");
			arrayDeque.offer("c");
			arrayDeque.offer("d");
			
			System.out.println("ArrayDeque as a Queue: "+arrayDeque);
		}
	}
}
