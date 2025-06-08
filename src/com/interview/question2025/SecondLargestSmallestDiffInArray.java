package com.interview.question2025;

import java.util.Arrays;

public class SecondLargestSmallestDiffInArray {

	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40, 50};
	        Arrays.sort(arr);
	        int secondLargest = arr[arr.length - 2]; // 40
	        int smallest = arr[0]; // 10
	        int difference = secondLargest - smallest;
	        System.out.println("Difference: " + difference); // Output: 30
	    }
	}