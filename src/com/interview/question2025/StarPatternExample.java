package com.interview.question2025;

public class StarPatternExample {
	public static void main(String args[]) {
		
		for(int i=1; i<=5; i++) {  // Outer loop -> number of rows.
			
			for(int j =1; j<=i; j++) { // Inner loop -> number of stars
				
				System.out.print("*"); // print star
			}
			System.out.println();	// After inner loop ends -> change line
		}
		
	}
}
