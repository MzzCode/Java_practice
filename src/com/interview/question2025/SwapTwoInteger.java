package com.interview.question2025;

public class SwapTwoInteger {
	// swapping of two number with out using extra variable
	
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping value of a : " +a+ " value of b is : " +b);
		
		 a = a+b; // 30
		 b = a-b; // 10
		 a = a-b; // 20
		 
		 System.out.println("After swapping value of a: " +a+ " value of b is : " +b);
		 
		 //swapping using temp variable
		 
		 int temp = a;
		 a=b;
		 b = temp;
		 
		
		 System.out.println("value of a: " +a +" & value of b: " +b  );
		 
		 // swapping using XOR logic
		 
		 System.out.println("Before swapping: a = " + a + ", b = " + b);
		 
		 a = a^b;
		 b = a^b;
		 a = a^b;
		 
		 System.out.println("After swapping: a = " + a + ", b = " + b);
	}
}
