package com.interview.question2025.majorityelement;

public class FindMajorityElementInArray {
	/*  Brute Force
		Time Complexity: O(n²)
		Space Complexity: O(1)
	 */	
	
	// method to find majority element
	
	public static int majorityElement(int arr[]) {
	
		// find the length of array
		
		int n= arr.length;
		// two loop are used i and j
		for(int i=0; i<n; i++) {
			int count =0;
			
		for(int j=0; j<n; j++) {
			if(arr[j]==arr[i]) {
				count++;
			}

			if(count>n/2) {
				return arr[i];
			}
		}
		}
		return -1;
	}
	public static void main(String args[]) {
		//array declaration
		int arr []= {2, 2, 1, 2, 3, 2, 2};
		System.out.println("Majority Element: "+majorityElement(arr));
	}
}
