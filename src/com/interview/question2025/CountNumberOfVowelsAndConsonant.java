package com.interview.question2025;

import java.util.*;
public class CountNumberOfVowelsAndConsonant {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Sentance: ");
		
		String sentance = sc.nextLine();
		
		int vowels = 0 , consonant = 0;

		// important step|| Convert the sentence to lowercase and store it as a character array
		char arr[] = sentance.toLowerCase().toCharArray();		
		
		// For each Loop with OR (||) to Retrieve each character in the array and count the vowels
		for(char ch : arr) {
		if(ch == 'a'|| ch== 'e'||ch=='i'||ch=='o'|| ch=='u') {
			vowels++;
		}
		else if(ch >='a' && ch<='z' ) {
		consonant++;
		}
		}
		System.out.println("Number of Vowels: "+vowels);
		System.out.println("Number of consonant: "+consonant);
	}
}

