package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void rmVehicle(Vehicle vehicle) {
		for (int i = 0; i < vehicles.size(); i++) {
			if (vehicles.get(i) == vehicle) {
				vehicles.remove(i);
			}
		}
	}

	public Vehicle listVehicles() {
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		return null;
	}

	public void costOfRepairs() {
		int cost = 0;
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getClass().getSimpleName().equals("Car")) {
				cost = 50;
				System.out.print(vehicle);
				System.out.print(", Cost: £");
				System.out.println(cost);
			} else if (vehicle.getClass().getSimpleName().equals("Bike")) {
				cost = 30;
				System.out.print(vehicle);
				System.out.print(", Cost: £");
				System.out.println(cost);
			} else {
				cost = 5000;
				System.out.print(vehicle);
				System.out.print(", Cost: £");
				System.out.println(cost);
			}
		}

	}

	public int fix(Vehicle vehicle) {
		int cost = 0;
		if (vehicle.getClass().getSimpleName().equals("Car")) {
			cost += 50;
		} else if (vehicle.getClass().getSimpleName().equals("Bike")) {
			cost += 30;
		} else {
			cost += 5000;
		}
		return cost;
	}

	public void rmByType(String type) {
		for (int i = 0; i < vehicles.size(); i++) {
			if (vehicles.get(i).getClass().getSimpleName().equals(type)) {
				vehicles.remove(i);
			}
		}
	}

}
