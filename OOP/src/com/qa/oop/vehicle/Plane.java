package com.qa.oop.vehicle;

public class Plane extends Vehicle {

	private boolean isflying;

	public Plane(String make, String model, int wheels, String fuel, boolean isflying) {
		super(make, model, wheels, fuel);
		this.isflying = isflying;
	}
	
	public boolean isIsflying() {
		return isflying;
	}

	public void setIsflying(boolean isflying) {
		this.isflying = isflying;
	}

	@Override
	public void travel() {
		System.out.println("Plane is flying");
	}

	@Override
	public String toString() {
		return "Plane [isflying=" + isflying + ", getId()=" + getId() + ", getMake()=" + getMake() + ", getModel()="
				+ getModel() + ", getWheels()=" + getWheels() + ", getFuel()=" + getFuel() + "]";
	}
	
}
