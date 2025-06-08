package com.interview.question2025;

public class CheckStringPalindrome {
	public static void main(String args[]) {
		
		String str1 = "madam";
		
	/*	for interger type
		int num = 121;
		
		convert int to string
		String str1 = Integer.toString(num); 
	*/
		int length = str1.length();
		
		// store reverse String
		
		String str2 = "";
		
		// for loop 
		for(int i =length-1; i>=0; i--) {
			str2 = str2+str1.charAt(i);
		}
				
		if (str1.equals(str2)) {
			System.out.println("String is plaindrome");
		}else {
		System.out.println("not palindrome");
	}
	}
}
