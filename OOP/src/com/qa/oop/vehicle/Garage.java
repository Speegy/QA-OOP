package com.qa.oop.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Garage extends Vehicle{

	private int maxVehicles = 10;
	
	public Garage(String make, String model, int wheels, String fuel) {
		super(make, model, wheels, fuel);
	}
	
	public Garage(String make, String model, int wheels, String fuel, int maxVehicles) {
		super(make, model, wheels, fuel);
		this.maxVehicles = maxVehicles;
	}

	private static List<Vehicle> allVehicles = new ArrayList<>();
	
	
	public static String addVehicle(Vehicle v) {
		if(allVehicles.size() < 10) {
			allVehicles.add(v);
			return "Vehicle Added";
		}else {
			return "Garage Full";
		}
	}

	public List displayVehicles() {
//		String vehicles = "";
//		for(int i = 0; i < allVehicles.size(); i++) {
//			vehicles += allVehicles.get(i) + "\n";
//		}
		return allVehicles;
	}
	
	
}
