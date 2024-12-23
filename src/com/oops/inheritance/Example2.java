package com.oops.inheritance;

// Parent class
class Employee {
    int salary = 60000;
}

// Child class inheriting from Employee
class Engineer extends Employee {
    int benifits = 50000;

    // Overridden toString() method
    @Override
    public String toString() {
        return ("Salary " + salary + "\n" +
                "Benefits " + benifits);
    }
}

public class Example2 {
    public static void main(String args[]) {
        Engineer e1 = new Engineer(); 
        System.out.println(e1.toString()); // Call toString() method to print details
    }
}
