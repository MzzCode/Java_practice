package com.interview.question2025;

public class FactorialOfNumber {
    public static void main(String args[]) {
        int num = 5;              
        int factorial = 1;        // factorial to 1 for multiplication 

        for(int i = 1; i <= num; i++) {
            factorial = factorial * i;   // Multiply current factorial by i(1,2,3,4,5)
        }

        System.out.println(factorial);   
    }
}
