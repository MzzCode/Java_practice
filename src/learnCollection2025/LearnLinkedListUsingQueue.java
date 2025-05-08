package learnCollection2025;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListUsingQueue {
    public static void main(String[] args) {

        // LinkedList as a Queue (FIFO: First-In-First-Out)
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue (inserts at the tail/rear)
        queue.offer("Lion");
        queue.offer("Tiger");
        queue.offer("Goat");
        queue.offer("Cow");

        System.out.println("Initial Queue: " + queue);

        // Removes element from the head/front side; returns null if queue is empty
        queue.poll();
        System.out.println("After poll(): " + queue);

        // Also removes head/front element, but throws NoSuchElementException if empty (not recommended method)
        queue.remove();
        System.out.println("After remove(): " + queue);

        // Retrieves head/front element without removing; returns null if empty
        System.out.println("Peek (front element): " + queue.peek());

        // Same as peek(), but throws NoSuchElementException if empty (not recommended method)
        System.out.println("Element (front element): " + queue.element());

        // Current size of the queue
        System.out.println("Size of queue: " + queue.size());
    }
}
