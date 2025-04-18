package com.insurance.main;

import com.insurance.model.Policy;

import java.util.List;

import com.insurance.dao.IPolicyDao;
import com.insurance.dao.PolicyDaoImpl;

public class MainModule {

	public static void main(String[] args) {
		Policy policy1 = new Policy(101, "Health Secure Plan", "Health", 5, 12000.50);
		Policy policy2 = new Policy(102, "Life Plus", "Life", 10, 15000.00);
		Policy policy3 = new Policy(103, "Auto Shield", "Vehicle", 3, 8000.75);
		Policy policy4 = new Policy(104, "Travel Easy", "Travel", 1, 4500.00);
		Policy policy5 = new Policy(105, "Home Guard", "Property", 7, 10500.99);

		IPolicyDao policie = new PolicyDaoImpl();
		policie.addPolicy(policy1);
		policie.addPolicy(policy2);
		policie.addPolicy(policy3);
		policie.addPolicy(policy4);
		policie.addPolicy(policy5);

		policie.deletePolicy(102);
		policie.deletePolicy(104);

		List<Policy> policie1 = policie.getAllPolicies();
		for (Policy policyn : policie1) {
			System.out.println(policyn);

		}

	}
}
