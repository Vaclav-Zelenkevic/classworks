package lt.vtmc.vaclav;

public class Dog extends Animal{
	
	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void eating() {
		System.out.println("An dog is eating ...");
	}
	
	public void barking() {
		System.out.println("Barking ...");
	}
}
