package com.qa.oop.vehicle;

public class Vehicle implements Abilities{
	
	private String make;
	private String model;
	private int wheels;
	private String fuel;
	
	public Vehicle(String make, String model,int wheels, String fuel) {
		this.make = make;
		this.model = model;
		this.wheels = wheels;
		this.fuel = fuel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public void travel() {
		
		
	}
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", wheels=" + wheels +  ", fuel=" + fuel + "]";
	}

	
	
}
