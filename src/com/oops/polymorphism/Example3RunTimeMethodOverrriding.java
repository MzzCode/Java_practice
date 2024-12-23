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
