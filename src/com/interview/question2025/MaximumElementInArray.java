package com.interview.question2025;

public class MaximumElementInArray {
	public static void main(String args[]) {
		
		int num[] = {4,-1,-60,7,20,100,29,10,};
		
		// optional to check array is empty or not
		
		if(num.length == 0) {
			System.out.println("Array is empty");
			return;
		}
		
		// assume first element array is maximum
		int maximum = num[0];
		
		for(int i=1; i<num.length; i++) {
			if(num[i] > maximum) {
				maximum = num[i];
			}
		}
		System.out.println("Maximum element: " +maximum);
	}

}
