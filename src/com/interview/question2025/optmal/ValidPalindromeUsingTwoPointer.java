package com.interview.question2025.optmal;

class Solution{
	
	public static boolean isPalindrome(String s) {
		
		s= s.toLowerCase(); // make case insensitive
		
		int left=0;
		int right = s.length()-1; 
		
		while(left<right) {
			// skip non-alphanumeric character form left
			while(left<right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
	
			// skip non-alphanumeric character from right
			while(left<right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
		}
			// Compare characters
            if (s.charAt(left) != s.charAt(right)) {
               return false;
		
	}
            left++;
            right--;
}
		return true;
	}
}
public class ValidPalindromeUsingTwoPointer {
	public static void main (String args[]) {
		
		String s = "A man, a plan, a canal: Panama";
		System.out.println(Solution.isPalindrome(s));
		
	}
}
