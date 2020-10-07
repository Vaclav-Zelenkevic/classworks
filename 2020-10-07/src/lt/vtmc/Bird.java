package lt.vtmc;

public class Bird extends Animal{

	private boolean canFly;
	
	public Bird(int id, String name, int age, boolean canFly) {
		super(id, name, age);
		this.canFly = canFly;
	}

	@Override
	public void makeSound() {}
	
	
	
}
