package com.hexa.over;

public class InherDemo {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("TVS Apache", 130000);
		vehicle.printDetails();

		Car car = new Car("Creta", 90000,"Rear Camera");
		car.printDetails();
		car.showAccessories();

	}

}
