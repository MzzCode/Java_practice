package com.interview.question2025;

public class ExtractDigitFromString {
	// by using Regular expression
	
	public static void main(String args[]) {
		
		String str1 = "java17developer2025";
		String str2 = str1.replaceAll("\\D", "");
		System.out.println("digits in the String: " +str2); 
		
		int number = Integer.parseInt(str2); // Make sure digits are within int range
		System.out.println(number);

	}
}
