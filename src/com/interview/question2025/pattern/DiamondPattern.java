package com.interview.question2025.pattern;

public class DiamondPattern {
    public static void main(String args[]) {

        // Diamond pattern = Pyramid (upper half) + Inverted Pyramid (lower half)

        int n = 5; //  number of rows 

        // Upper Half - Pyramid
        for (int i = 1; i <= n; i++) { // Outer loop for rows

            
            for (int j = 1; j <= n - i; j++) { // first inner loop for space
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {//2nd inner loop Print stars (2*i - 1)
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        //  Lower Half - Inverted Pyramid
        for (int i = 1; i <= n; i++) { // Outer loop for rows
            
            for (int j = 1; j < i; j++) { // for space
                System.out.print(" ");
            }
            
            for (int k = 1; k <= 2 * (n - i) + 1; k++) { // Print stars 2*(n-i)+1
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
