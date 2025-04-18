package com.hexa.over;

public class EmpMain {
	public static void main(String[] args) {
		Employee employee = new Employee("Thomas",90000);
		employee.printDetails();
		Manager manager = new Manager("Henry",80000,"Chennai");
		manager.printDetails();
		manager.printDetail();
	}

}
