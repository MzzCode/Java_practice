package arrayExample;

import java.util.Scanner;

public class BasicArrayExample2 {
public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	 // Prompt the user to enter the size of the array
	System.out.print("Enter your array size: ");
	int length = sc.nextInt();
	
	// Declare an array with the specified length
	int arr[] = new int[length];
	
	// Loop to get user input for each element of the array
	for(int i= 0; i<length; i++) {
		
		// Prompt the user to enter each element at the respective index
		System.out.print("Enter your element in array at index " +(i) + " : " );
		
		 arr[i] = sc.nextInt(); // Store the input in the array
	}
	 System.out.println("The elements of the array are:");
	for(int i =0; i<length; i++) {
		
		// Print each element with its corresponding index
		System.out.println("Element in the array at index " +i+ " : " +arr[i]);
	}
	
	
	sc.close();

}
}
