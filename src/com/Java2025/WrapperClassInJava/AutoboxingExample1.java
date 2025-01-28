package com.Java2025.WrapperClassInJava;

import java.util.ArrayList;

public class AutoboxingExample1 {
    public static void main(String args[]) {
        // Example 1: Autoboxing with char to Character
        char ch = 'm'; // Primitive data type (char)
        Character x = ch; // Autoboxing: Converting primitive char to wrapper class Character
        System.out.println(x); // Prints: m (Character object toString() representation)

        
        int a = 50; 
        Integer y = a; 
        System.out.println(y); 

        // Example 3: Autoboxing with Collections (ArrayList)
        // ArrayList can only store objects, not primitive data types.
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); // Create an ArrayList of Integer objects
        arrayList.add(24); // Autoboxing: Converting primitive int (24) to Integer and adding it to the ArrayList

        
        System.out.println(arrayList.get(0)); // Unboxing: Integer object converted back to primitive int, Prints: 24
    }
}
