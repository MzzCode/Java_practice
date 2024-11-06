package com.oops.Constructor;

class Number {
    // Default constructor
    Number() {
        this(10); // Calls the constructor Number(int x)
        System.out.println("Default constructor called: ");
    }

    // Constructor with one integer parameter
    Number(int x) {
        this(20, 10); // Calls the constructor Number(int x, int y)
        System.out.println(x);
    }

    // Constructor with two integer parameters
    Number(int x, int y) {
        System.out.println(x * y);
    }
}

public class ChanningConstructor {
    public static void main(String args[]) {
        new Number(); // Create a new Number object, which triggers the constructors
       // Number cc = new Number(); it is also correct
    }
}
//Java program to illustrate Constructor Chaining
//within same class Using this() keyword
//and changing order of constructors


