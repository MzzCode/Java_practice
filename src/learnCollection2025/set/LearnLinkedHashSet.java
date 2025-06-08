package learnCollection2025.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
	public static void main(String args[]) {
		Set<String> set = new LinkedHashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("apple");  // Duplicate, ignored
		System.out.println("LinkedHashSet: "+set); // Output: [apple, banana] //insertion order preserved

	}

}
