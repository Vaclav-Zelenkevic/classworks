package lt.vtmc;

public class Dog extends Animal{

	public Dog(int id, String name, int age) {
		super(id, name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("Au ...");
	}

}
