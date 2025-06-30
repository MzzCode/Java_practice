package com.Java2025.java8feature;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeExample {
	public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Date: " + today);
        System.out.println("Time: " + time);
    }
}
