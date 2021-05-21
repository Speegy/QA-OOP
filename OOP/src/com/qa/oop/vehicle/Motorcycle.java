package com.qa.oop.vehicle;

public class Motorcycle extends Vehicle{
	
	private boolean hasHelmet;
	
//	public Motorcycle(String make, String model, boolean hasHelmet) {
//		super(make, model);
//		this.hasHelmet = hasHelmet;
//	}
	
	public Motorcycle(String make, String model, int wheels, String fuel, boolean hasHelmet) {
		super(make, model, wheels, fuel);
		this.hasHelmet = hasHelmet;
	}

	public boolean isHasHelmet() {
		return hasHelmet;
	}

	public void setHasHelmet(boolean hasHelmet) {
		this.hasHelmet = hasHelmet;
	}


	@Override
	public void travel() {
		System.out.println("I am off roading");
	}

	@Override
	public String toString() {
		return "Motorcycle [hasHelmet=" + hasHelmet + ", getId()=" + getId() + ", getMake()=" + getMake()
				+ ", getModel()=" + getModel() + ", getWheels()=" + getWheels() + ", getFuel()=" + getFuel() + "]";
	}


}
