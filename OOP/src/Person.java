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
	
}
