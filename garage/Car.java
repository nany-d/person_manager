package com.qa.garage;

public class Car extends Vehicle {

	private String bootSize;

	public Car(String make, String engineSize, int noOfWheels, boolean fly, String bootSize) {
		super(make, engineSize, 4, false);
		setBootSize(bootSize);
	}

	public String getBootSize() {
		return bootSize;
	}

	public void setBootSize(String bootSize) {
		this.bootSize = bootSize;
	}

}
