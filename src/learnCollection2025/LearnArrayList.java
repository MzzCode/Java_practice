package learnCollection2025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        
        // Create an ArrayList to store student names
        List<String> studentNames = new ArrayList<>();
    
        // Add elements to the ArrayList
        studentNames.add("Mega Wars");
        studentNames.add("John");
        studentNames.add("Luke");
        System.out.println("After initial adds: " + studentNames);

        // Add element at the end
        studentNames.add("Spider Man");
        System.out.println("After adding Spider Man: " + studentNames);

        // Add element at a specific index
        studentNames.add(2, "Iron Man"); // Inserts at index 2, shifting others
        System.out.println("After inserting Iron Man at index 2: " + studentNames);

        // Create another list and add elements
        List<String> newStudentNames = new ArrayList<>();
        newStudentNames.add("Captain America");
        newStudentNames.add("Black Panther");

        // Add all elements from newStudentNames into studentNames
        studentNames.addAll(newStudentNames);
        System.out.println("After adding new students: " + studentNames);

        // Remove element by index
        studentNames.remove(6); // Removes "Black Panther" (index starts from 0)
        System.out.println("After removing element at index 6: " + studentNames);

        // Remove element by value
        studentNames.remove("Iron Man"); 
        System.out.println("After removing 'Iron Man' by value: " + studentNames);

        // Replace (update) an element at a specific index
        studentNames.set(3, "Black Panther"); // Replaces element at index 3
        System.out.println("After replacing index 3 with Black Panther: " + studentNames + "\n");

        // Iterate ArrayList in 3 Ways:

        // 1. Using for loop
        System.out.println("----Using for loop----");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println("Student Name at index " + i + ": " + studentNames.get(i));
        }
        System.out.println();

        // 2. Using enhanced for-each loop
        System.out.println("----Using for-each loop----");
        for (String name : studentNames) {
            System.out.println("Student Name: " + name);
        }
        System.out.println();

        // 3. Using Iterator
        System.out.println("----Using Iterator----");
        Iterator<String> iterator = studentNames.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator element: " + iterator.next());
        }
     // Get the size of the list
        System.out.println("List size " + studentNames.size());
       
     // Clear all elements in the list
        studentNames.clear();
        System.out.println("Empty list return " +studentNames);
        

    }
}
