package com.qa.oop.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Garage{

	private int maxVehicles = 10;
	
	public Garage() {
	}
	public Garage(int maxVehicles) {
		this.maxVehicles = maxVehicles;
	}
	

	private static List<Vehicle> allVehicles = new ArrayList<>();
	
	
	public static String addVehicle(Abilities v) {
		if(allVehicles.size() < 10) {
			allVehicles.add((Vehicle) v);
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
