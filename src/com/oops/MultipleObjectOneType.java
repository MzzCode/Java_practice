package com.oops;

class Customer {
    int id;
    String name;

    Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Customer ID: " + id + ", Name: " + name);
    }
}

public class MultipleObjectOneType {
    public static void main(String[] args) {
        // Creating multiple Customer objects
        Customer customer1 = new Customer(1, "John");
        Customer customer2 = new Customer(2, "Emma");

        customer1.display();
        customer2.display();
    }
}

