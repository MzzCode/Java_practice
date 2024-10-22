package com.Java2024;

import java.util.Scanner;

public class MethodExample3 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num = sc.nextInt();
	
	findEvenOdd(num);
	sc.close();
	}
	public static void findEvenOdd(int num) {
		if(num%2==0) {
		System.out.println(+num+":is Even Number");
		}
		else {
			System.out.println(+num+ ":is odd Number");
	}
		
		
	}
	

}
