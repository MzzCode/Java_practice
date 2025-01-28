package com.Java2025.Exception;

public class NullPointerExceptionExample {
	public static void main(String args[]) {
	String str = null;
	
	try {
		int length = str.length();
		System.out.println("length" +length);
	}catch(NullPointerException e) {
		System.out.println("error: "+e.toString());
	}
	}
}
