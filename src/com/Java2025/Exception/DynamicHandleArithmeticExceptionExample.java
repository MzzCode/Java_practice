package com.Java2025.Exception;
import java.util.Scanner;

public class DynamicHandleArithmeticExceptionExample {
    public static void main(String[] args) {
        // Create a single Scanner instance to avoid resource leaks
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter integer a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter integer b: ");
        int b = scanner.nextInt();
        
        try {
            int result = a / b;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
	        }
        scanner.close();
    }
}
