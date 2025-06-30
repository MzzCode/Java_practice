package com.Java2025.java8feature;

import java.util.Optional;

public class OptionalExample {
	    public static void main(String[] args) {
	        String str = "Hello";
	        Optional<String> optional = Optional.ofNullable(str);

	        if (optional.isPresent()) {
	            System.out.println(optional.get());
	        } else {
	            System.out.println("Value is not present");
	        }
	    }
}
