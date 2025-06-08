package com.interview.question2025;

public class ReverseAString {
	public static void main(String args[]) {
	
		// step 1: create a string to be reversed
		String original = "java";
		
		// step 2: check the length of string
		int len = original.length();
		
		// Step 3: initialize an empty string to hold the reversed result
		
		String reverse = "";
		
		// step 4: for Loop from the end to the beginning of string
		
		for(int i = len-1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		
		// step 5: print the reverse string
		System.out.println("Reverse of " +original+ " : " +reverse);
	
	   // 2ND Method: Using StringBuilder to reverse the string directly
		
		StringBuilder sb = new StringBuilder(original); // pass the original string in constructor
		
		System.out.println("Reverse using StrinBuilder: " +sb.reverse());
	}
}
