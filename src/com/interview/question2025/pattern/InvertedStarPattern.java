package com.interview.question2025.pattern;

public class InvertedStarPattern {
	
	    public static void main(String[] args) {

	        int n = 5; // Total number of rows

	        // Outer loop for each row
	        for (int i = 1; i <= n; i++) {

	            // Inner loop to print stars in decreasing order
	            for (int j = n; j >= i; j--) {
	                System.out.print("*");
	            }

	            // Move to next line
	            System.out.println();
	        }
	    }
	}
