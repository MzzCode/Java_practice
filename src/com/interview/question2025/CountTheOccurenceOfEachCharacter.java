package com.interview.question2025;

import java.util.HashMap;
import java.util.Map;

public class CountTheOccurenceOfEachCharacter {
	
	// method for get Char count in string
    public static void getCharCount(String value) {
        // Check for null or empty values
       
    	if (value == null || value.isEmpty()) {
            System.out.println("Input string is null or empty.");
            return;
        }

        // Convert value to lowercase to make it case-insensitive
        value = value.toLowerCase();

        Map<Character, Integer> charMap = new HashMap<>();

        // Convert string value to character array
        
        char[] arr = value.toCharArray();

        // Loop through each character
        for (char val : arr) {
        	
            // Skip spaces character (optional)
            if (val == ' ') {
                continue;
            }

            // Update the map with character count
            if (charMap.containsKey(val)) {
                charMap.put(val, charMap.get(val) + 1);
            } else {
                charMap.put(val, 1);
            }
        }
        // Print result
        System.out.println(value + " : " +charMap);
    }
    //main method
    public static void main(String[] args) {
        getCharCount("abc ABC ddd eEe");
    }
}
