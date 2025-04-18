package com.hexa.basics;

public class EmpMain {
	String empName;
	double salary;
	public EmpMain(String empName,double salary) {
		this.empName = empName;
		this.salary=salary;
	}
	void printDetails() {
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
	}
	String greeting() {
		return "Good Morning "+empName;
	}
	void bonus(int amount) {
		System.out.println("Bonus: "+salary*2);
	}
	

}
