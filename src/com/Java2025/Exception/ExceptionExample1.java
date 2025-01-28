package com.Java2025.Exception;

public class ExceptionExample1 {
	public static void main(String args[]) {
		
		try {
			int data = 10/0 ;
		}
			catch(ArithmeticException e) {
				e.printStackTrace();
				
				System.out.println();
				
				System.out.println("error: " +e.getMessage()+"\n");
				
				System.out.println(e.toString());
				
				System.out.println();
				
				System.out.println("cause: " +e.getCause());
				
     	}
	}
}

