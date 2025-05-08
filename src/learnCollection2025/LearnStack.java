package learnCollection2025;

import java.util.*;

public class LearnStack {
	public static void main(String args[]) {
		// Create a Stack of Strings
        Stack<String> animals = new Stack<>();

        // Push elements into the stack (LIFO - Last In First Out)
        animals.push("Lion");     // bottom (index 0)
        animals.push("Elephant");
        animals.push("Goat");
        animals.push("Horse");
        animals.push("Cat");      // top (index 4)

        // Display the entire stack
        System.out.println("Stack: " + animals);

        // ✅ Peek: View the top element without removing it
        System.out.println("Element at top of stack: " + animals.peek());

        // ✅ Pop: Remove the top element from the stack
        animals.pop(); // removes "Cat"
        System.out.println("Stack after pop: " + animals);

        // View the new top element
        System.out.println("Element now at top of stack: " + animals.peek());

        // ✅ Check if the stack is empty
        System.out.println("Is stack empty? " + animals.empty());

		
		// for seaching Element in stack
		/*
		animals.push("Lion"); // bottom because first-IN (at 0th position)  4
		animals.push("Elephant");                                           3
		animals.push("Goat");                                               2
		animals.push("Horse"); // top (at 3rd postion)                      1
		
		But in search operation number start from 1
		*/
		
		System.out.println("Position of 'Goat' from top: " +animals.search("Goat")); // 2
		
		// if we search element which is not present in Stack it will return -1
		
		System.out.println("Position of 'Tiger': " +animals.search("Tiger")); //-1
		
		// Check the size of Stack
		
		System.out.println("Current stack size: "  +animals.size());
	}
}
