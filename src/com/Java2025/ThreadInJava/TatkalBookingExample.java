package com.Java2025.ThreadInJava;

class TicketBooking {
    private int availableTicket = 100;

    synchronized boolean bookTicket(String user) {
        if (availableTicket > 0) {
            System.out.println(user + " ticket booked successfully. Remaining: " + (availableTicket - 1));
            availableTicket--;
            return true;
        } else {
            System.out.println(user + " ticket not booked, ticket sold out.");
            return false;
        }
    }
}

public class TatkalBookingExample {
    public static void main(String args[]) {
        TicketBooking bookingSystem = new TicketBooking();

        Runnable userTask = () -> {
            String user = Thread.currentThread().getName();
            try {
                // Adding a random delay between 100ms to 500ms
                Thread.sleep((long) (Math.random() * 2800) + 5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bookingSystem.bookTicket(user);
        };

        Thread[] users = new Thread[120];  // 120 users

        for (int i = 0; i < users.length; i++) {
            users[i] = new Thread(userTask, "User" + (i + 1));
            users[i].start();
        }
    }
}
