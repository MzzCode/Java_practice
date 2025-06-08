package com.interview.question2025;

public class SecondLargestNumberInArray {
	public static void main(String args[]) {
		
		
		int arr[] = {1, 4, -10, -3, -1, 3};

		// Initial assumption: firstLargest and secondLargest are very small
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
		    
		    // If current element is greater than firstLargest
			// then update both firstLargest and secondLargest
		    if (arr[i] > firstLargest) {
		        secondLargest = firstLargest; // old max becomes second max
		        firstLargest = arr[i];        // update max
		    }
		   
		    else if (arr[i] < firstLargest && arr[i] > secondLargest) {
		        secondLargest = arr[i]; // only update second max
		    }
		}

		
		if (secondLargest == Integer.MIN_VALUE) {
		    System.out.println("no second Largest element found may be all elements are same");
		} else {
		    System.out.println("2nd Largest element: " + secondLargest);
		}
	}
}
