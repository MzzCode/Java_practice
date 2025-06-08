package com.interview.question2025;

public class MinimumElementInArray {

    public static void main(String args[]) {

        // Create and initialize an array of integers
        int num[] = {-10, 1, 5, 6, -11};

      //optional 
      		if(num.length == 0) {
      			System.out.println("arrary is empty");
      			return;
      		}
        // Assume the first element is the minimum
        int minimum = num[0];

        // for loop
        for (int i = 1; i < num.length; i++) {

            // If the current element is less than the assumed minimum, update it
            if (num[i] < minimum) {
                minimum = num[i];
            }
        }
        System.out.println("Minimum element in array: " + minimum);
    }
}
