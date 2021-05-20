package com.qa.oop.employment;
import com.qa.oop.Person;

public class Employee extends Person{
	
	private double annualSalary;
	private double weeklySalary;
	
	public Employee(String name, int age, String gender,double annualSalary) {
		super(name, age, gender);
		this.annualSalary = annualSalary;
		this.weeklySalary = calculateWeeklySalary();
		
	}
	
	public double calculateWeeklySalary() {
		return this.annualSalary/52;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	
}
//	a field annualSalary of type double
//	a field weeklySalary of type double
//	a method calculateWeeklySalary() which makes use of the formula weeklySalary = annualSalary / 52.