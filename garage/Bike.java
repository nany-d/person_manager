package com.qa.garage;

public class Bike extends Vehicle {

	private String coolness;

	public Bike(String make, String engineSize, int noOfWheels, boolean fly, String coolness) {
		super(make, engineSize, 2, false);
		setCoolness(coolness);
	}

	public String getCoolness() {
		return coolness;
	}

	public void setCoolness(String coolness) {
		this.coolness = coolness;
	}

}
