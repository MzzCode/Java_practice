package com.oops;

// Class representing a Project with a name and duration
// Implements the Cloneable interface to allow object cloning
class Project implements Cloneable {
    String name;      
    int duration;     

    // Constructor 
    Project(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    // Overriding the clone method to allow cloning of Project objects
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Call the clone method from the Object class
    }

    // Method to display
    void display() {
        System.out.println("Project Name: " + name + ", Duration: " + duration + " months");
    }
}

// Main class to demonstrate object cloning in Java
public class ObjectCreateExample3 {
    public static void main(String[] args) {
        try {
            // Creating an original project
            Project originalProject = new Project("ERP System", 12);

            // Cloning the project for another department using the clone method
        
            Project clonedProject = (Project) originalProject.clone();

            // Displaying the details of the cloned project
            clonedProject.display();
            // Displaying the details of the original project
            originalProject.display();
        } catch (CloneNotSupportedException e) {
            
            e.printStackTrace();
        }
    }
}




