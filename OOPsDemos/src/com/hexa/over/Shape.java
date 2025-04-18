package com.hexa.over;

public class Shape {
	void area(int x) {
		System.out.println("Square: "+Math.pow(x, 2));
	}
	int area(int x , int y) {
		return x*y;
	}
	void area(double r) {
		System.out.println("Circle: "+0.5/(2*Math.PI));
	}
	double area(int x ,float y) {
		return (x*y);
	}

}
