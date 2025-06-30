package com.interview.question2025;

public class ExtractDigitsFromString {
	public static void main(String args[]) {
		
		String str1 = "java17developer2025";
		//convert string to charArray and use method Character.isDigit(ch)
			for(char ch : str1.toCharArray()) {
			if(Character.isDigit(ch)) {
				System.out.print(ch);
			}
		}
	}
}
