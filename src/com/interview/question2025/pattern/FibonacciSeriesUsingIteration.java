package com.interview.question2025.pattern;

public class FibonacciSeriesUsingIteration {
    public static void main(String args[]) {
        
    	// start for 0 and 1
    	int n = 8;
    	int first= 0, second =1 , sum;
    	for(int i=0;i<n; i++) {
    		if(i==0) {
    			System.out.print(first + " ");
    		}else if(i== 1) {
    			System.out.print(second +" ");
    		}
    		else {
    			sum = first + second;
    			System.out.print(sum + " ");
    			first = second; // second become first
    			second = sum ; // sum become second
    		}
    	}
    }
}

