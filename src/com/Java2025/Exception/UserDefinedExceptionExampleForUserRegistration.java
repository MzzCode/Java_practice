package com.Java2025.Exception;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message); // Pass the message to the Exception class constructor
	}
}

public class UserDefinedExceptionExampleForUserRegistration {

	public void validateAge(int age) throws InvalidAgeException{
		if (age<18) {
			throw new InvalidAgeException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
		}
	
	public static void main(String args[]) {
		UserDefinedExceptionExampleForUserRegistration userRegestration = 
				new UserDefinedExceptionExampleForUserRegistration();
		try {
			userRegestration.validateAge(16); // Throws InvalidAgeException
	        } catch (InvalidAgeException e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	}
}
