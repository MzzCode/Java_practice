package com.oops.Constructor;

class Booking{
	String movieName;
	int seatCount;
	String timing;
	
	 // Default constructor - No arguments
	public Booking() {
		System.out.println("Welcome to dhana dhan movie booking system");
	}
	
	// constructor with movie name info
	public Booking(String MovieName) {
		this.movieName = MovieName;
	}
	
	// constructor with seat info
	public Booking(int SeatCount) {
		this.seatCount = SeatCount;
	}
	
	//// Constructor to initialize movie name, seat count, and show timing
	public Booking(String MovieName, int SeatCount, String Timing) {
		this.movieName = MovieName;
		this.seatCount = SeatCount;
		this.timing = Timing;
	}
	
	public void DisplayMovie() {
		System.out.println("Movie name: " +movieName);
	}
	public void DisplaySeat() {
		System.out.println("Seat Avialable: " +seatCount);
	}
	// Method to display all booking details
	public void DisplayAllDetail() {
		System.out.println("Movie name: " +movieName + 
				", Seat Avialable: " +seatCount + ", Show Timing: " +timing);
	}
}


	public class ConstructorOverloading2 {
	public static void main(String args[]) {
	
	// Calling the default constructor
	Booking b = new Booking();
	
	// Creating Booking object with only movie name
	Booking b1 = new Booking("Spider Man");
	b1.DisplayMovie();
	
	Booking b2 = new Booking(50);
	b2.DisplaySeat();
	
	Booking b3 = new Booking("complete java guide", 100, "5:00 PM");
	b3.DisplayAllDetail();
	
}
}
