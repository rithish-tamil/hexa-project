package com.hexa.over;

public class Manager extends Employee {
	String city;
	
	public Manager(String employeeName,double salary,String city) {
		super(employeeName,salary);
		this.city = city;
	}
	void printDetail() {
		System.out.println("City: "+city);
	}
}
