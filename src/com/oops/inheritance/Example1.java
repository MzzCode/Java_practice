package com.oops.inheritance;

// Base class: Bicycle
class Bicycle {
    // Data fields (or Data Members)
    public int gear;   // Represents the number of gears
    public int speed;  // Represents the current speed of the bicycle

    // Constructor to initialize gear and speed
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // Method to apply brakes by reducing speed
    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }

    // Method to speed up by increasing speed
    public void speedUp(int increment) {
        speed = speed + increment;
    }
}

// Derived class: MountainBike extends Bicycle
class MountainBike extends Bicycle {

    // Additional data field specific to MountainBike
    public int seatHeight;  // Represents the height of the seat

    // Constructor to initialize gear, speed, and seatHeight
    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed); // Calls the parent class (Bicycle) constructor
        this.seatHeight = seatHeight;
    }

    // Method to set the seat height
    public void setHeight(int height) {
        seatHeight = height;
    }

    // Overridden toString() method to display the Bicycle details
    public String toString() {
        return ("No of gear are " + gear + "\n" +
                "speed of bicycle is " + speed + "\n" +
                "Bicycle seat height " + seatHeight);
    }
}

public class Example1 {
    public static void main(String args[]) {
        
        MountainBike mb1 = new MountainBike(3, 60, 15);

        // Calling methods to modify object state
        mb1.speedUp(50);       // Increases speed by 50
        mb1.applyBrake(5);     // Reduces speed by 5
        mb1.setHeight(20);     // Updates seat height to 20

        // Printing the object details using the overridden toString() method
        System.out.println(mb1.toString());
    }
}
