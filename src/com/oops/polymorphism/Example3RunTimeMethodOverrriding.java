package com.oops.polymorphism;

class Bank{
	 float getRateOfInterest() {
		return 0f;
	}
}
class SBI extends Bank{
	float getRateOfInterest() {
		return 7.5f;
	}
}
class Kotak extends Bank{
	float getRateOfInterest() {
		return 8.7f;
	}
}

class BOI extends Bank{
	float getRateOfInterest() {
		return 6.5f;
	}
}
public class Example3RunTimeMethodOverrriding {
public static void main(String args[]) {
	 Bank b;
	 b= new SBI();
	System.out.println("SBI RateOfInterest " +b.getRateOfInterest()); 
	 
	 b= new Kotak();
	 System.out.println("Kotak RateOfInterest " +b.getRateOfInterest());
	 
	 b= new BOI();
	 System.out.println("BOI RateOfInterest: " +b.getRateOfInterest());
}
}
/*
 * This Java sample uses method overriding to demonstrate polymorphism. 
 * It provides a method called getRateOfInterest() on the Bank type, which returns 0. 
 * The Bank class is extended by the subclasses SBI, Kotak, and BOI, 
 * which override the getRateOfInterest() function to return particular interest rates. 
 * Objects of SBI, ICICI, and AXIS are created and assigned to a Bank reference variable b 
 * in the TestPolymorphism class's main method. The relevant getRateOfInterest() method 
 * is dynamically executed through polymorphism, depending on the actual object 
 * type provided to b, and the interest rates for SBI, Kotak, and BOI banks are printed out.
 */
 

