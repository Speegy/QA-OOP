package com.qa.oop;
public class Person {
	
	public String name;
	public int age;
	public String gender;
	
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void read(Book x) {
		System.out.println(name + " is reading "+ x.title);
	}

	
	// Getter / Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
