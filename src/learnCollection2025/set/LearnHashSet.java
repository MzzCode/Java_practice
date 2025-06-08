package learnCollection2025.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {

    public static void main(String args[]) {
      
        Set<String> set = new HashSet<>();

        
        set.add(null);     // Only one null allowed in HashSet
        set.add("A");
        set.add("B");
        set.add("C");
        set.add(null);     // Duplicate null is ignored

        // Printing the set - order is not guaranteed
        System.out.println("HashSet: " + set);

        // remove(Object o) - removes the specified element if present, returns true/false
        System.out.println("Removing element 'A': " + set.remove("A")); // true
        System.out.println("Trying to remove non-existing element 'D': " + set.remove("D")); // false

        // contains(Object o) - checks if the element is present in the set
        System.out.println("Does set contain 'C'? " + set.contains("C")); // true

        // containsAll(Collection<?> c) - checks if all elements in the given collection exist in the set
        Set<String> checkSet = new HashSet<>(Arrays.asList("B", "C"));
        System.out.println("Does set contain all elements 'B' and 'C'? " + set.containsAll(checkSet)); // true

        Set<String> anotherSet = new HashSet<>(Arrays.asList("B", "X"));
        System.out.println("Does set contain all elements 'B' and 'X'? " + set.containsAll(anotherSet)); // false
    }
}
