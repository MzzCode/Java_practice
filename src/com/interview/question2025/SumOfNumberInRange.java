package com.interview.question2025;

public class SumOfNumberInRange {
	public static void main(String args[]) {
		// when user give input
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter starting number");
//		int start = sc.nextInt();
//		System.out.println("Enter last number");
//		int end = sc.nextInt();

		// when user defined defined custom start and end interval
		
		int start = 2;
		int end = 8;
		int sum =0;
		for(int i=start; i<=end; i++) {
			sum = sum+i;
		}
		System.out.println("sum of number in the interval "+start+", " +end+ " is : " +sum);
		//sc.close();
	}

}
