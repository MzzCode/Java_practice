package com.interview.question2025.pattern;

public class InvertedStarPatternUsingExtraVarible {

    public static void main(String args[]) {
        int n = 5; // Total number of rows
        int numberOfStar = 1; 

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {

            // Inner loop to print stars in decreasing order
            for (int j = n; j >= numberOfStar; j--) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();

            // Increase the number of stars to print in the next row
            numberOfStar++;
        }
    }
}
