package com.interview.question2025;

public class FindPrimeNumber {
	
	public static boolean isPrime(int num) {
		
	if(num <=1) return false;
	
	for(int i=2; i<=Math.sqrt(num); i++) {
		if(num % i == 0) return false;
		
	}
	return true;
	
	}
	public static void main(String[] args) {
		
		// for print a certain range of prime number
		
		System.out.println("prime number b/w 1 to 100");
		
		for(int num=1; num<=100; num++) {
			if(isPrime(num)) {
				System.out.print(num + " ");
			}
		}
		 // if want to know is number is prime or not
		
		int num = 11;
		System.out.println("\n" +num+ " is prime number: " +isPrime(num));
		
	}
}
