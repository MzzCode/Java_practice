package com.Java2024;

import java.util.Scanner;

// pre-defined Method
public class MethodExample {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = sc.nextInt();
		// using the sqrt() method of Math class  
		System.out.println("square root of "+num+" is :"+Math.sqrt(num));
		
		double result = Math.round(Math.sqrt(num));
		System.out.println("Round off of squre root result is : "+result);
		
		System.out.println("another example of pre defined method");
		
		System.out.print("Enter your First number and second number: ");
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		// using the max() method of Math class 
		System.out.println("Maximum number is: " +Math.max(n1,n2));
					
		sc.close();
	
		
	}

}
