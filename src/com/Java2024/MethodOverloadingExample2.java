package com.Java2024;
import java.util.*;
public class MethodOverloadingExample2 {
	
	public void cube() {
		System.out.println("No parameter cube is invoked");
	}
	// Method with an integer parameter
	
	public void cube(int num) {
		int result = num*num*num;
		System.out.println("Cube of Integer: " +result);
		}
	
	// Method with a double parameter
	public void cube(double num) {
		
		 // It calculates the cube of the double value and prints the result.
		double result = num*num*num;
		System.out.println("cube of Double: " +result);
		}
	
	public static void main(String args[]) {
		
		//create a instance of the class
		MethodOverloadingExample2 m = new MethodOverloadingExample2();
		// without parameter method access
		m.cube();
		
		// cube using user input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your integer value: ");
		int intInput = sc.nextInt(); //intInput: This variable is used in the main method to store the value that the user inputs from the console.
		m.cube(intInput);// stored the intInput value and passes to the to the cube(int num) method
		                 //and after it cube(int num) method perform operation acc. to its method body
		
		System.out.print("Enter your Double value: ");
		double doubleInput = sc.nextDouble();
		m.cube(doubleInput);
		
		sc.close();
		
	}

}
