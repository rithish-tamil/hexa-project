package com.hexa.over;

public class Vehicle {
	String model;
	double price;
	
	public Vehicle(String model,double price) {
		super();
		this.model = model;
		this.price = price;
	}
	
	void printDetails(){
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
		
    }
}
