package com.Java2025.WrapperClassInJava;

import java.util.ArrayList;

public class UnboxingExample {
    public static void main(String[] args) {
        // Step 1: Using wrapper class (Integer) to store a value
    	
        Integer wrapperValue = 100; // Autoboxing: primitive int to Integer object
        
        int primitiveValue = wrapperValue; //Integer object back to a primitive int
        System.out.println("Unboxed primitive value: " + primitiveValue); 

        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(200); // Adding a primitive int as an Integer object

        // Retrieve value from ArrayList (Unboxing happens here)
        int listValue = list.get(0); 
        System.out.println("Unboxed value from ArrayList: " + listValue); 
    }
}

