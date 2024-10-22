package com.oops;

// Class definition Myclass
class Myclass {
    // Method 
    void display() {
        System.out.println("Object created using Class.forName()");
    }
}


public class ObjectCreateExample2 {
    public static void main(String[] args) {
        try {
            
            // Fully qualified name includes the package name 'com.oops' and the class name 'Myclass'
            Class<?> cls = Class.forName("com.oops.Myclass");

            // Create an instance of Myclass using the default constructor
            // getDeclaredConstructor().newInstance() is used to invoke the default constructor of Myclass
            Myclass obj = (Myclass) cls.getDeclaredConstructor().newInstance();

            
            obj.display();
        } catch (Exception e) {
            // Catch and print any exceptions that occur during the process
            e.printStackTrace();
        }
    }
}
