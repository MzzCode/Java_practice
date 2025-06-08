package com.interview.question2025.pattern;

public class StarpatternUsingExtraVarible {
	public static void main(String args[]) {
		
		int n = 4; //for number of rows
		int numberOfStar = 1;
				
		// outer loop for rows
		for(int i=1; i<=n; i++) {
			
			for(int j=0; j<numberOfStar; j++) {
				
				System.out.print("*");
			}
			System.out.println();
			numberOfStar = numberOfStar+1;
		}
	
	}
}
