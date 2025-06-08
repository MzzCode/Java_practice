package com.interview.question2025.pattern;

public class StarPatternOne {
	public static void main(String args[]) {
		
		for(int i =1; i<=4; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Another way");
		System.out.println("*\n**\n***\n****");
	}
}
