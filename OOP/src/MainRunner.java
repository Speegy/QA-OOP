
public class MainRunner {

	public static void main(String[] args) {
		boolean running = true;
		while(running) {
			
			Person jake = new Person("Jake", 26, "Male");
			Book bible = new Book("Bible", "Religious");
			jake.read(bible);
			System.out.println(jake.gender);
			running = false;
		}

	}

}
