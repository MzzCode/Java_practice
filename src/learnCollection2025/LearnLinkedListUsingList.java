package learnCollection2025;

import java.util.LinkedList;
import java.util.List;

public class LearnLinkedListUsingList {
	public static void main(String args[]) {
	// LinkedList as a List (index-based operations)
	List<String> list = new LinkedList<>();
	
	list.add("Apple");
	list.add("Banana");
    list.add("Cherry");
    list.add(1, "Blueberry"); // insert at index 1
  
    
    System.out.println("List: " + list);
    
 // Access elements
    System.out.println("Element at index 2: " + list.get(2));
    
    list.set(2, "Mango"); // update element at index 2
    System.out.println("After set(): " + list);
	
 // Remove by index
    list.remove(1);
    System.out.println("After remove(1): " + list);
	
    // Contains, size
    System.out.println("Contains 'Apple'? " + list.contains("Apple")); // found return True
    System.out.println("Contains 'grapes'? " + list.contains("grapes")); // Not found return false
    System.out.println("Size: " + list.size());
    
    // List iteration
    
    System.out.println("List Iterating");
    // for-each loop
    
    for(String fruite : list){
    	System.out.println("fruits List: " + fruite);
    
    }
	
	}
}
