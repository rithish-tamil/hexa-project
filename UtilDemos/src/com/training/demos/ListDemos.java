package com.training.demos;

import java.util.ArrayList;
import java.util.List;

public class ListDemos {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("2");
		
		System.out.println(fruits);
		
		for(Object fruit : fruits) {
			String fr = (String)fruit;
			System.out.println(fr.toUpperCase());
		}

	}

}
