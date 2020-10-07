package lt.vtmc;

public class Cat extends Animal{

	public Cat(int id, String name, int age) {
		super(id, name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("Meow ...");
	}
	
}
