package com.interview.question2025;

public class SumOfN_NaturalNumber {

    // Method to find sum of first N natural numbers using formula
    public static int sumOfNaturalNumber(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String args[]) {
        int n = 5;

        System.out.println("Sum of first " + n + 
        		" natural numbers using formula: " 
        		+ sumOfNaturalNumber(n));

        // Sum of first N natural numbers using loop
        int num = 5;
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of first " + num + " natural numbers using loop: " + sum);
    }
}
