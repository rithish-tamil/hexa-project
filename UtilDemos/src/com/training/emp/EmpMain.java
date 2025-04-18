package com.training.emp;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Fahad",1,"Chennai",80000);
		Employee employee2 = new Employee("Ramu",2,"Banglore",75000);
		Employee employee3 = new Employee("Mohan",3,"Mumbai",90000);
		Employee employee4 = new Employee("Kuldeep",4,"Coimbatore",62000);
		Employee employee5 = new Employee("Kumar",5,"Madurai",120000);
		
		List employeeList = new ArrayList();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		
		for(Object employee : employeeList) {
			System.out.println(employee);
		}
		
	}

}
