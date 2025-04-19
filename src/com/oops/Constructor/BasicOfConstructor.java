package com.oops.Constructor;

	class Car{
		private String name;  // instance variable
		private String model;
		private String color;
		private int year;
	
		// Constructor to initialize instance variables when object is created
		public Car(String name, String model, String color,int year) {
		this.name = name;     // Setting value for instance variable 'name'
		this.model = model;
		this.color = color;
		this.year = year;
	}

	@Override // Overriding toString method to display object details
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", color=" + color + ", year=" + year + "]";
	}
	}
	

	public class BasicOfConstructor {
		public static void main(String args[]) {
			
			// create object and calling constructor to set value to instance variable
			Car myCar = new Car("Maruti", "vitar breeza", "white", 2023);
			
			// automatic toString call
			// System.out.println(myCar);
			
			// manually toString call
			System.out.println(myCar.toString());
		}
}
