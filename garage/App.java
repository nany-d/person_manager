package com.qa.garage;

public class App {
	public static void main(String[] args) {

		Garage garage = new Garage();

		Vehicle car1 = new Car("Audi", "v8", 4, false, "black");
		Vehicle car2 = new Car("BMW", "v12", 4, false, "black");
		Vehicle bike1 = new Bike("Moped", "v1", 2, false, "3");
		Vehicle helicopter1 = new Helicopter("Bell", "v30", 0, true, 16000);

		garage.addVehicle(car1);
		garage.addVehicle(car2);
		garage.addVehicle(bike1);
		garage.addVehicle(helicopter1);
		garage.listVehicles();
		garage.costOfRepairs();

		System.out.print("Vehicle fix price: ");
		System.out.println(garage.fix(helicopter1));

		garage.rmByType("Car");
		garage.listVehicles();

	}

}
