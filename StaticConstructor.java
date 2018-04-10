package projectEuler;

class Person {
	
	public String name;
	public int pesel;
	
	public void speak() {
		System.out.println("Co jest kurwa ?");
	}
	
	public Person(int x) {
		System.out.println("konstruktorem kurwa !");
	}
	
	
}


public class StaticConstructor {
	

	public static void main(String[] args) {
		
		Person tkaniu = new Person(5);
		tkaniu.speak();
		

	}

}
