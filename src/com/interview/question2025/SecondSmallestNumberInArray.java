package com.interview.question2025;

public class SecondSmallestNumberInArray {
	
	public static void main(String args[]) {
		
		int arr[] = {10, -4, 10, -3, -3, 7, 7};
		// You can test this too: int arr[] = {-7, -7, -7, -7};

		// Step 1: Initialize two variables with MAX value
		// So that any real number from array will be smaller
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		// Step 2: Loop through the array
		for(int i = 0; i < arr.length; i++) {

			// If current element is smaller than firstSmallest
			// then update both firstSmallest and secondSmallest
			if(arr[i] < firstSmallest) {
				secondSmallest = firstSmallest; // old min becomes second min
				firstSmallest = arr[i];  // update new min

		// it run when if condition false
			} else if(arr[i] > firstSmallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];  // only update secondMin
			}
		}

		// Step 3: Check if secondSmallest was ever updated
		if (secondSmallest == Integer.MAX_VALUE) {
			System.out.println("No second smallest number found (all elements may be equal).");
		} else {
			System.out.println("Second smallest number is: " + secondSmallest);
		}
	}
}
