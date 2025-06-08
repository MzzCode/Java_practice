package com.interview.question2025.pattern;

public class RightAlignedStarUsingExtraVarible {
	
public static void main(String args[]) {
	
	int n= 5; // for number of rows
	int numberOfSpace = n-1; // for space
	int numberOfStar = 1; // for star

	
	for(int i=1; i<=n; i++) { // outer loop for rows
		
		for(int j=0; j< numberOfSpace; j++) { // 1st inner loop for space 
			System.out.print(" ");
		}
		for(int k=0; k<numberOfStar; k++) {
			System.out.print("*"); // 2nd inner loop for star
		}
		// Move to the next line after printing each row
		System.out.println();
		
		// Update values for next row
		numberOfSpace = numberOfSpace - 1;
		numberOfStar = numberOfStar + 1;
	}
}
}
