package com.oops.encapsulation;

public class Employee {
	
	private String employeeId;
    private String name;
    private double salary;
	private String accessKey;
    
    
    
    public Employee(String employeeId, String name, double salary) {
    	this.employeeId = employeeId;
    	this.name = name;
    	this.salary = salary;
    	
    }

    	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary(String accessKey) {
        if ("HR_ACCESS".equals(accessKey)) {
          return salary;
        } else {
            System.out.println("Access denied!");
            return -1;
        }
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getAccessKey() {
		return accessKey;
	}
	public void setAccessKey(String accessKey) {
		this.accessKey= accessKey;
	}
	
//	@Override
//	public String toString() {
//		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary +"]";
//	}
	
	@Override
	public String toString() {
	    String salaryInfo = "Access Denied";
	   
		if ("HR_ACCESS".equals(accessKey)) {
	        salaryInfo = String.valueOf(salary);
	    }
	    return "Employee{" +
	           "employeeId='" + employeeId + '\'' +
	           ", name='" + name + '\'' +
	           ", salary=" + salaryInfo +
	           '}';
	}
	}

  
