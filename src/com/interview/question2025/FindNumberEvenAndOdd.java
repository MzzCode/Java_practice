package com.interview.question2025;

public class FindNumberEvenAndOdd {
	public static void main(String args[]) {
		// for printing all even number from 1 to 50 
		
		System.out.println("Even Number from 1 to 50: ");
		for(int num =1; num<=50; num++) {
			if(num % 2 == 0) {
				System.out.print(+num+ " ");
			}
		}	
		int num = 23;
		if(num % 2 == 0) {
			System.out.println("\n"+num +" is even");
		}
		else {
			System.out.println("\n"+num+ " is odd");
		}
	}
}