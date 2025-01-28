package com.Java2025.WrapperClassInJava;

// Custom wrapper class to wrap a primitive int
class WrapperCustomClass {
    // store the encapsulated primitive value
    private int value;

    // Constructor to initialize the value
    public WrapperCustomClass(int value) {
        this.value = value;
    }

    // Getter method to retrieve the encapsulated value
    public int getValue() {
        return value;
    }

    // Setter method to modify the encapsulated value
    public void setValue(int value) {
        this.value = value;
    }

    // Overriding the toString() method to provide a string representation of the object
    @Override
    public String toString() {
        return Integer.toString(value);
    }
}

public class Example1 {
    public static void main(String args[]) {

        WrapperCustomClass wrapperCustomClass = new WrapperCustomClass(10);

        // Printing the object, which calls the overridden toString() method
        System.out.println(wrapperCustomClass); // Output: 10

        // Using the getter method to retrieve the value from the custom wrapper class
        System.out.println(wrapperCustomClass.getValue()); // Output: 10
    }
}

