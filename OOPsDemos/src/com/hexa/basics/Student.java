package com.hexa.basics;

public class Student {
	String studentName;
	String city;

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "Kevin";
		student1.city = "Banglore";
		System.out.println("Name: " + student1.studentName);
		System.out.println("City: " + student1.city);

		Student student2 = new Student();
		student2.studentName = "Benjamin";
		student2.city = "Chennai";
		System.out.println("\nName: " + student2.studentName);
		System.out.println("City: " + student2.city);

	}

}
