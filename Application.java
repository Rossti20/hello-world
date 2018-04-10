package Cave;

class Gupki {
	public String toString() {
		return "Hello";
	}
}

class Brain {
	
	public Brain() {
		System.out.println("Thinking...");
	}
}


class Person {
	
	private Brain mozg;
	
	private String name;

	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;	
		mozg = new Brain();
		
	}
	
	public void writeName() {
		System.out.println("My name is: " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

public class Application {


	public static void main(String[] args) {
	
		System.out.println("Hello World!");
		
		Person person = new Person("Maciek");
		
		String name = person.getName();
		
		name = name + " Gacek";
		person.setName(name);
		
		
		
		person.writeName();
		
		Gupki gupek1 = new Gupki();
		System.out.println(gupek1);
		
		
		
		
		
		
		
		
	
	}
}
