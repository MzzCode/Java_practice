package com.Java2025.oops;

abstract class Shape1{
	abstract double calculateArea();
	
	String color;
	
	// abstract class have constructor
	
	Shape1(String color){
		this.color = color;
	}
	/*
	 Optional: used if toString is not overridden in child class
    
    void dispColor() {
  	System.out.println("Color: " +color);
	}
 
 */
}

class Circle1 extends Shape1{
	double radius;
	
	Circle1(String color, double radius){
		super(color);
		this.radius = radius;
	}
	
	double calculateArea() {
		return Math.PI*radius*radius;
	}
	
	public String toString() {
		return "color of Circle: " +color+ " area: " +calculateArea();
	}
}

class Square1 extends Shape1{
	double side;

	Square1(String color, double side){
	super(color);
	this.side = side;
}

	double calculateArea() {
	return side*side;
}

public String toString() {
	return "color of Square: " +color+ " area: " +calculateArea();
}
}

public class AbstractionMain2 {
	
	public static void main(String args[]) {
		
		Shape1 c = new Circle1("Red", 4);
		//c.dispColor(); then it also become optional for shape color
		System.out.println(c.toString());
		
		Shape1 s = new Square1("Blue", 5);
		//s.dispColor();
		System.out.println(s.toString());
	}

}
