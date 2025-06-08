package learnCollection2025;

import java.util.ArrayDeque;
import java.util.Deque;

public class LearnArrayDequeAsDeque {
    public static void main(String[] args) {

        Deque<String> arraydeque = new ArrayDeque<>();

        // Queue Operations (FIFO)
        arraydeque.offer("First");
        arraydeque.offer("Second");
        arraydeque.offer("Third");
        arraydeque.offer("Fourth");

        System.out.println("Queue Initial Insertion: " + arraydeque);

        // Remove first element
        arraydeque.poll();
        System.out.println("After poll() - remove first: " + arraydeque);

        // Peek first element
        System.out.println("Peek first element: " + arraydeque.peek());

        System.out.println("-----");

        // Stack Operations (LIFO)
        arraydeque.push("apple");
        arraydeque.push("banana");
        arraydeque.push("grapes");

        System.out.println("As Stack after push(): " + arraydeque);

        arraydeque.pop();
        System.out.println("After pop() - remove top: " + arraydeque);

        System.out.println("-----");

        // Deque Operations (Both ends)
        arraydeque.offerFirst("Cat");
        arraydeque.offerLast("Tiger");

        System.out.println("After Deque operations: " + arraydeque);
        System.out.println("First element (getFirst): " + arraydeque.getFirst());

        arraydeque.pollLast();
        System.out.println("After pollLast() - remove last: " + arraydeque);
    }
}
