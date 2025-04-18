package com.hexa.over;

public class Employee {
	String employeeName;
	double salary;
	
	public Employee(String employeeName,double salary) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	void printDetails() {
		System.out.println("Name: "+employeeName);
		System.out.println("Salary: "+salary);
	}

}
