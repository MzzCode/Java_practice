 package com.oops.object;

 //Define a Blueprint (Interface):You create a blueprint for what a vehicle should do.
 
 interface Vechile{
	void drive();
}
 
// Concrete Vehicles (Implementations): You create specific vehicles that follow this blueprint

 class Car implements Vechile{
	 public void drive() {
		 System.out.println("Driving a car");
	 }
 }
 
 class Bike implements Vechile{
	 public void drive() {
		 System.out.println("Driving a Bike");
	 }
 }
 //Create a Factory (Creator): You set up a factory with a method to produce vehicles, but it doesn’t specify what type:
abstract class VechileFactory{
	abstract Vechile createVechile();
}
 //Specific Factories (Concrete Creators): You set up specific factories that know how to create specific types of vehicles:
class CarFactory extends VechileFactory{
	@Override
	Vechile createVechile() {
		return new Car();
	}
}

class BikeFctory extends VechileFactory{
	@Override
	Vechile createVechile() {
		return new Bike();
	}
}

//Use the Factory:To get a vehicle, you use the specific factory. The client code doesn’t need to know the details of how the vehicle is created:
public class ObjectCreationExample5 {
	public static void main(String args[]) {
	VechileFactory carFactory = new CarFactory();
	Vechile car = carFactory.createVechile();
	car.drive();
	
	VechileFactory bikeFactory = new BikeFctory();
	Vechile bike = bikeFactory.createVechile();
	bike.drive();

}
}
