package learnCollection2025.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class LearnTreeSet {
	public static void main(String args[]) {
		NavigableSet<Integer> set = new TreeSet<>();
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(2);
		set.add(4);
		System.out.println("TreeSet: "+set); // Output: [1, 2, 3,4,5] // output is sorted nature

	}

}
