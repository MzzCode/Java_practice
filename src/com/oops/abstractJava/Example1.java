package com.oops.abstractJava;

// Abstract class representing a generic shape
abstract class Shapes {
    
    // Common property for all shapes (color)
    String color;
    
    // Constructor to initialize the color of the shape
    Shapes(String color) {
        this.color = color;
    }
    
    // Abstract method to be implemented by subclasses to calculate area
    abstract double calculateArea();
    
    // Method to display the color of the shape
    // Dynamically retrieves the subclass name using getClass().getSimpleName()
    void dispColor() {
        System.out.println(getClass().getSimpleName() + " Shape Color: " + color);
    }
}

// Circle class extending Shapes
class Circle extends Shapes {
    double radius;
    
    
    Circle(String color, double radius) {
        super(color);  
        this.radius = radius;
    }
    
    // Implementation of the abstract method to calculate the area of the circle
    double calculateArea() {
        return Math.PI * radius * radius;  // Formula for area of a circle
    }
}

class Square extends Shapes {
    double side;
    
    Square(String color, double side) {
        super(color);  
        this.side = side;
    }
    
    double calculateArea() {
        return side * side;  // Formula for area of a square
    }
}

public class Example1 {
    
    public static void main(String args[]) {
        Shapes circle = new Circle("blue", 4);
        Shapes square = new Square("red", 6);
        
        // Display color and area of the circle
        circle.dispColor();
        System.out.println("Area of circle: " + circle.calculateArea());
        
        square.dispColor();
        System.out.println("Area of square: " + square.calculateArea());
    }
}
