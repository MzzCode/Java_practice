package com.oops.encapsulation;

// Example of Encapsulation
public class BankAccount {
    private String accountHolderName;
    private double balance;

    // Constructor to initialize fields
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for account holder name
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for account balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    // Method to deposit amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw amount from the account with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn amount: " + amount);
        } else {
            System.out.println("Insufficient Amount to withdraw");
        }
    }
}
