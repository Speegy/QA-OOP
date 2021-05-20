package com.qa.oop.vehicle;

public class Motorcycle extends Vehicle{
	
	private boolean hasHelmet;
	
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
	public String toString() {
		return "Motorcycle [hasHelmet=" + hasHelmet + ", make=" + getMake() + ", model=" + getModel()
				+ ", wheels=" + getWheels() + ", fuel=" + getFuel() + "]";
	}	
	
}
