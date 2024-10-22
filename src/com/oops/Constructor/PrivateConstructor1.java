package com.oops.Constructor;

class Singleton1 {
    // Step 1: Create a private static instance of the class.
    // This variable will hold the single instance of Singleton1.
    private static Singleton1 instance;
    
    // Step 2: Make the constructor private to prevent instantiation from other classes.
    // The constructor is private so no other class can instantiate this class directly.
    private Singleton1() {
        // Private constructor to prevent instantiation from outside
    }
    
    // Step 3: Provide a public static method that returns the instance of the class.
    // This method controls access to the Singleton instance.
    public static Singleton1 getInstance() {
        // If no instance exists, create one.
        if(instance == null) {
            instance = new Singleton1();
        }
        // Return the existing instance (either newly created or already existing).
        return instance;
    }
    
 
    // This is a sample method to show that the Singleton instance can have behavior.
    public void showInfo() {
        System.out.println("Hello, this is a Singleton class!");
    }
}

public class PrivateConstructor1 {
    public static void main(String args[]) {
        // Access the Singleton instance via getInstance() method
        // Get the only instance of Singleton1
        Singleton1 sin1 = Singleton1.getInstance();
        sin1.showInfo();  // Call the method to demonstrate the Singleton instance functionality
        
        // Attempt to get another instance
        Singleton1 sin2 = Singleton1.getInstance();
        sin2.showInfo();  // Call the method again on the second reference
        
        // Check if both instances are the same
        // Since only one instance should ever be created, sin1 and sin2 should be the same
        System.out.println("Are both instances the same?: " + (sin1 == sin2));
    }
}
