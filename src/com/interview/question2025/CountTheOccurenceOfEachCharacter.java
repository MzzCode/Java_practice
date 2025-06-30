package com.interview.question2025;

import java.util.HashMap;
import java.util.Map;

// class
public class CountTheOccurenceOfEachCharacter {
	
	// method 
    public static void getCharCount(String value) {
       
    	// Check for null or empty values
       
    	if (value == null || value.isEmpty()) {
            System.out.println("Input string is null or empty.");
            return;
        }
    	
    	// Convert value to lowercase 
        
    	value = value.toLowerCase();
    	
    	// Convert string value to character array
        
        char[] arr = value.toCharArray();

        Map<Character, Integer> charMap = new HashMap<>();

        // Loop through each character
        for (char val : arr) {
        	
            // Skip spaces character (optional)
            if (val == ' ') {
                continue;
            }

            /*  Using containsKey() to count frequency
           
            if (charMap.containsKey(val)) {
                charMap.put(val, charMap.get(val) + 1);
            } else {
                charMap.put(val, 1);
            }
            */
            
         // Using getOrDefault() to count frequency
            charMap.put(val, charMap.getOrDefault(val, 0) + 1);
        }
        // Print result
        System.out.println(value + " : " +charMap);
    }
    
    public static void main(String[] args) {
    	String s  = "Aa Bbba cbC";
    	getCharCount(s);
      //  getCharCount("Aa Bbba cbC");
    }
}
