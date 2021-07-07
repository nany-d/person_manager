package com.qa.garage;

public abstract class Vehicle {

	private String make;
	private String engineSize;
	private int noOfWheels;
	private boolean fly;

	public Vehicle(String make, String engineSize, int noOfWheels, boolean fly) {
		setMake(make);
		setEngineSize(engineSize);
		setNoOfWheels(noOfWheels);
		setFly(fly);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", engineSize=" + engineSize + ", noOfWheels=" + noOfWheels + ", fly=" + fly
				+ "]";
	}

}
