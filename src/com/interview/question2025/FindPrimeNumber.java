package com.interview.question2025;

public class FindPrimeNumber {

    // Method to check if a number is prime
	
    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        // Loop from 2 to square root of num (efficient check)
        for (int i = 2; i <= Math.sqrt(num); i++) {
           
            if (num % i == 0) return false;
        }

        // If no divisors found, it's a prime number
        return true;
    }

    public static void main(String[] args) {

       // optional if interviewer ask to print some range of prime number
        System.out.println("Prime numbers between 1 and 100:");

        for (int num = 1; num <= 100; num++) {
            
        	// Call isPrime method 
        	if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        // Check if a specific number is prime
        int num = 11;
        System.out.println("\n" + num + " is a prime number: " + isPrime(num));
    }
}
