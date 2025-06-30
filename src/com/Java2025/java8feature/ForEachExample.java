package com.Java2025.java8feature;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
	 public static void main(String[] args) {
	        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");
	        fruits.forEach(fruit -> System.out.println(fruit));
	    }
}
