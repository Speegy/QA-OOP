package com.qa.oop.employment;

import java.util.ArrayList;
import java.util.List;
import com.qa.oop.Person;

public class Trainee extends Person{

	private double bursary;
	private List<String> subjectsLearned = new ArrayList<>();
	
	public Trainee(String name, int age, String gender, double bursary) {
		super(name, age, gender);
		this.bursary = bursary;
	}
	
	public void addSubject(String value) {
		this.subjectsLearned.add(value);
	}
	

	public double getBursary() {
		return bursary;
	}

	public void setBursary(double bursary) {
		this.bursary = bursary;
	}

	public String getSubjectsLearned() {
		String allSubjects = "";
		for(int i = 0; i < subjectsLearned.size(); i++) {
			allSubjects += subjectsLearned.get(i) + "\n";
		}
		return allSubjects;
	}

	public void setSubjectsLearned(ArrayList<String> subjectsLearned) {
		this.subjectsLearned = subjectsLearned;
	}

	
}
//a field bursary of type double
//a list of subjects learned as a field called subjectsLearned
//a method addSubject() for adding a new subject to the list.