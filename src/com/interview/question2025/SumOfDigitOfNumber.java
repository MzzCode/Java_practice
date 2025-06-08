package com.interview.question2025;

public class SumOfDigitOfNumber {
    public static void main(String[] args) {

        int num = 480;   
        int sum = 0;     //store the sum of digits

        // Loop runs until num becomes 0
        while (num > 0) {
            int digit = num % 10;    // Extract the last digit
            
            sum = sum + digit;       // Add the digit to the sum

            num = num / 10;          // Remove the last digit
        }
        System.out.println("Sum of digits: " + sum);
    }
}
