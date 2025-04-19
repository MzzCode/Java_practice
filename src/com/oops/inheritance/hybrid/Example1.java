package com.oops.inheritance.hybrid;

// Base class 
class Person {
    public String name; 

    public Person(String name) {
        this.name = name;
    }
    public void displayInfo() {
        System.out.println("Name of person: " + name);
    }
}

// Employee class inheriting from Person
class Employee extends Person {
    private int salary; 

    public Employee(String name, int salary) {
        super(name); // call parentclass constructor
        this.salary = salary;
    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

// Interface representing a sportsperson
interface Sportman {
   void playSport(); // Abstract method to be implemented by classes
    					// In Java interfaces, **all methods are implicitly public and abstract by default 
}

// implementing Sportman interface
class Manager extends Employee implements Sportman {
    private String departmnetName; 

    public Manager(String name, int salary, String departmentName) {
        super(name, salary); // call parentclass constructor
        this.departmnetName = departmentName;
    }

    public void displayDepartment() {
        System.out.println("Name of department is: " + departmnetName);
    }
     /* 
     we must write the exact method declared in the interface Sportman.
     otherwise it gives error
     */ 
    public void playSport() {
        System.out.println(name + " likes to play Cricket.");
    }

}

/*question:
 *  Why do we write the method playSport() two times — once in interface, and once in class?
Can’t we just write System.out.println(...) directly in the interface?
Answer: No we cannot write implementation (body) of a method in an interface

It’s a default method (Java 8+), or
A static method

Any class that implements an interface must provide its own 
implementation of the methods defined in that interface
*/

// main class
public class Example1 {
    public static void main(String args[]) {
        Manager manager = new Manager("Mega Wars", 10000, "IT");

        // Display information about the manager
        manager.displayInfo(); 
        manager.displayDepartment(); 
        manager.playSport(); 
    }
}
