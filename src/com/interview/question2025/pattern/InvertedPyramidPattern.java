package com.interview.question2025.pattern;

public class InvertedPyramidPattern {
    public static void main(String args[]) {
        
        int n = 5; // number of rows
        
        for(int i = 1; i <= n; i++) {
            
            // Print spaces j<i
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            // Print stars 2*(n-i)+1
            for(int k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
