package com.interview.question2025.pattern;

public class PyramidPattern {
	public static void main(String args[]) {
		
		int n=5; // total number of rows
		for(int i=1; i<=n; i++) { // outer loop for rows
			
			for(int j=1; j<=n-i; j++) { // first inner loop for space (n-i)
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) { // 2nd outer loop for star (2*i-1)
				System.out.print("*");
			}
			// Move to next line after each row
			System.out.println();
		}
	}
}
