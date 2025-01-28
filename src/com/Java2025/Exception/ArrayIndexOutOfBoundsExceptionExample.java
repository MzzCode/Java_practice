package com.Java2025.Exception;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String args[]) {
		
		int arr[] = {1,3,4,2,1}; // Initializing an array with 5 elements 
		try {
			int index = 5; // Accessing an index that is out of bounds 
			int value = arr[index]; // Attempting to access an element at an invalid index  
			System.out.println("Value at index " + index + ": " + value);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Index is out of bounds.");
		}
	}
}
