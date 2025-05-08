package learnCollection2025;

import java.util.Deque;
import java.util.LinkedList;
public class LearnLinkedListUsingDeque {

	public static void main(String args[]) {
		Deque<String> deque = new LinkedList<>();
		
		deque.add("a");
		deque.add("b");
		deque.add("c");
		deque.add("d");
		
		System.out.println("Elements added sequentially at rear in LinkedList: " +deque);
		
		//now use of Deque-specific methods
		
		deque.addFirst("Mega"); // Throws if bounded LinkedList
		deque.addLast("wars");
		
		deque.offerFirst("Jhon"); // Safe add to front
        deque.offerLast("Deo");  // Safe add to rear
		
		System.out.println("LinkedList after adding element both ends: " +deque);
		
		 // -------- Accessing Elements --------
		
		System.out.println("First Element (getFirst): " + deque.getFirst()); // Throws if empty
        System.out.println("Last Element (getLast): " + deque.getLast());
        
        System.out.println("First Element (peekFirst): " + deque.peekFirst()); // null if empty
        System.out.println("Last Element (peekLast): " + deque.peekLast());  
        
     // -------- Removal Operations --------
        deque.removeFirst();
        deque.removeLast();
        System.out.println("LinkedList after removing first and Last: " +deque);

        deque.pollFirst(); 
        deque.pollLast();  

        System.out.println("LinkedList After pollFirst & pollLast: " + deque);
        
        // -------- Stack-Like Operations --------(LIFO)
        
        deque.push("E");// FIRST
        deque.push("F");
        deque.push("G");//TOP
        
        System.out.println("LinkedList After Push operation: " +deque);
        
        deque.pop(); // remove top element G
        
        System.out.println("LinkedList After Pop Operation: " +deque);
        
        // size
        System.out.println("LinkedList Size: " +deque.size());
        
        // -------- Safe Removal on Empty --------
        deque.clear();  // Empty the deque

        System.out.println("Deque after clear(): " + deque);
        System.out.println("pollFirst() on empty deque: " + deque.pollFirst()); // null
        System.out.println("peekFirst() on empty deque: " + deque.peekFirst()); // null
        
	}
}
