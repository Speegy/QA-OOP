package com.qa.oop;
import com.qa.oop.employment.Employee;
import com.qa.oop.employment.Trainee;
import com.qa.oop.vehicle.Car;
import com.qa.oop.vehicle.Vehicle;

public class MainRunner {

	public static void main(String[] args) {
		boolean running = true;
		while(running) {
			
//			Person jake = new Person("Jake", 26, "Male");
//			Trainee trainee = new Trainee(jake.name, jake.age, jake.gender,100.00);
//			Employee employee = new Employee(jake.name, jake.age, jake.gender, 52000);
//			PersonTraits jake2 = new PersonTraits(jake.name, jake.age, jake.gender, "brown", 10.10, 150);
//			Book bible = new Book("the Bible", "Religious");
//			jake2.read(bible);
			
//			trainee.addSubject("Math");
//			trainee.addSubject("Science");
//			System.out.println(trainee.getSubjectsLearned());
//			System.out.print(employee.getWeeklySalary());
			
			//String make, String model,int wheels, String fuel
			Vehicle one = new Vehicle("Toyota", "Camry", 4, "Gas");
			//String make, String model, int wheels, String fuel, int doors, String style
			Car a = new Car(one.getMake(), one.getModel(), one.getWheels(), one.getFuel(), 4, "Sedan");
			System.out.println(a);
			System.out.println(one);
			
			
			
			running = false;
		}

	}

}
