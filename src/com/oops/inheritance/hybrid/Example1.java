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
        super(name); 
        this.salary = salary;
    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

// Interface representing a sportsperson
interface Sportman {
    void playSport(); // Abstract method to be implemented by classes
}

// implementing Sportman interface
class Manager extends Employee implements Sportman {
    private String departmnetName; 

    public Manager(String name, int salary, String departmentName) {
        super(name, salary); 
        this.departmnetName = departmentName;
    }

    public void displayDepartment() {
        System.out.println("Name of department is: " + departmnetName);
    }
     /* public void displaySportman() error 
     we must implement the exact method declared in the interface Sportman.
     Implementation of the playSport() method from the Sportman interface
     */ 
    public void playSport() {
        System.out.println(name + " likes to play sports.");
    }
}

public class Example1 {
    public static void main(String args[]) {
        Manager manager = new Manager("Mega Wars", 10000, "IT");

        // Display information about the manager
        manager.displayInfo(); 
        manager.displayDepartment(); 
        manager.playSport(); 
    }
}
