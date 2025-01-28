package com.oops.encapsulation;

public class Example2 {
public static void main(String args[]) {
	Employee employee = new Employee("123", "Mega wars", 20000);
	employee.setAccessKey("HR_ACCESS");
	System.out.println(employee.toString());
	
}
}
