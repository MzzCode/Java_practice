package com.Java2025.oops;
abstract class Shape{
	// abstract method it must be extends by child class who implement abstraction
	
	abstract double calculateArea();
}
class Circle extends Shape{
	double radius;
	
	//constructor
	Circle(double radius){
		this.radius = radius;
	}
	
	// implement abstact method
	double calculateArea(){
		return Math.PI*radius*radius;
	}
}

class Square extends Shape{
	double side;
	
	Square(double side){
		this.side = side;
	}
	
	//implementing abstract method
	
	double calculateArea() {
		return side*side;
	}
}
public class AbstractionMain {
	public static void main(String args[]) {

		Shape c = new Circle(4);
		System.out.println("Area of circle: " +c.calculateArea());
		
		Shape s = new Square(2);
		System.out.println("Area of Square: " +s.calculateArea());
	}
}