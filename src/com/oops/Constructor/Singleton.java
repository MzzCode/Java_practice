package com.oops.Constructor;

class DatabaseConnection {
    // Step 1: Create a private static instance of the class
    private static DatabaseConnection instance;
    
    // Step 2: Make the constructor private so that it cannot be instantiated outside this class
    private DatabaseConnection() {
        System.out.println("Database Connection established.");
    }
    
    // Step 3: Provide a public static method to get the instance of the class
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    // Method to simulate database operations
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}

public class Singleton {
    public static void main(String[] args) {
        // Get the only instance of DatabaseConnection
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.query("SELECT * FROM users");
        
        // Attempt to get another instance
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.query("SELECT * FROM products");
        
        // Check if both instances are the same
        System.out.println("Are both instances the same? " + (db1 == db2));
    }
}

