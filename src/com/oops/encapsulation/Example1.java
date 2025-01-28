package com.oops.encapsulation;

public class Example1 {
    public static void main(String args[]) {
        // Create a BankAccount object with initial details
        BankAccount bankaccount = new BankAccount("Mega wars", 5000);

        // Display initial account details
        System.out.println("Account holder: " + bankaccount.getAccountHolderName());
        System.out.println("Initial Account Balance: " + bankaccount.getBalance());

        // Update account holder name and balance
        bankaccount.setAccountHolderName("Luke John");
        bankaccount.setBalance(7000);
        
        // Display updated details
        System.out.println("Updated Account holder name: " + bankaccount.getAccountHolderName());
        System.out.println("Updated Balance: " + bankaccount.getBalance());

        // Perform deposit and withdrawal operations
        bankaccount.deposit(600);
        bankaccount.withdraw(400);

        // Display total balance after transactions
        System.out.println("Total Balance: " + bankaccount.getBalance());
    }
}
