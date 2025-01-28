package com.Java2025.Exception;

import java.sql.SQLException;

class AccountOperationException extends Exception{
	public AccountOperationException(String message ,Throwable casue) {
		super(message, casue);
	}
}
public class BankingApplication {
	public static void main(String [] args) {
		try {
			performAccountOperation();
		}catch(Exception e) {
			System.out.println("Error: " +e.getMessage());
		}
	}
	
	public static void performAccountOperation() throws AccountOperationException {
		try {
			connectToDatabase();
			}catch(SQLException e) {
				throw new AccountOperationException("Failed to perform account operation", e);
		}
	}

	public static void connectToDatabase() throws SQLException {
        throw new SQLException("Database connection failed");
}
}
