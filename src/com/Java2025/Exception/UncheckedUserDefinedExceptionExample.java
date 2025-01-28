package com.Java2025.Exception;
class InvalidScoreException extends RuntimeException{
	public InvalidScoreException(String message) {
		super(message);
	}
}
public class UncheckedUserDefinedExceptionExample{
	public void validateScore(int score) {
		if(score <0 || score >100) {
			throw new InvalidScoreException ("Score must be in between 0 to 100");
		}
		System.out.println("score is valid: " +score);
	}
	public static void main(String args[]) {
		UncheckedUserDefinedExceptionExample uncheckedUserDefinedExceptionExample = 
				new UncheckedUserDefinedExceptionExample();
		try {
		uncheckedUserDefinedExceptionExample.validateScore(-10);
		}catch(InvalidScoreException e) {
			System.out.println("error: " +e.getMessage());
		}
	}
}


