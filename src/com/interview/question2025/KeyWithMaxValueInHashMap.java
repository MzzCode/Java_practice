package com.interview.question2025;
import java.util.HashMap;
import java.util.Map;
public class KeyWithMaxValueInHashMap {
	public static void main(String args[]) {
		
		// key with the maximum value in a HashMap without using built-in max functions

		Map<String, Integer> map = new HashMap<>();

		map.put("A", 2);
		map.put("B", 6);
		map.put("C", 3);
		map.put("D", 5);

		// Step 1: Initialize variables, key and value for maximum
		String maxKey = null;
		int maxValue = Integer.MIN_VALUE;

		// Step 2: loop to find the maximum value
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		    if (entry.getValue() > maxValue) {
		        maxValue = entry.getValue(); // Update max value
		        maxKey = entry.getKey();     // Update corresponding key
		    }
		}

		System.out.println("MaxKey = " + maxKey + " Value = " + maxValue);

	}

}
