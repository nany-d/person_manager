package com.qa.garage;

public class Helicopter extends Vehicle {

	private int maxAltitude;

	public Helicopter(String make, String engineSize, int noOfWheels, boolean fly, int maxAltitude) {
		super(make, engineSize, 0, true);
		setMaxAltitude(maxAltitude);
	}

	public int getMaxAltitude() {
		return maxAltitude;
	}

	public void setMaxAltitude(int maxAltitude) {
		this.maxAltitude = maxAltitude;
	}

}
