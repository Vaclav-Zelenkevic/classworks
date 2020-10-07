package lt.vtmc;

public class Duck extends Bird{

	private String color;
	
	public Duck(int id, String name, int age, boolean canFly) {
		super(id, name, age, canFly);
	}

	@Override
	public void makeSound() {
		System.out.println("Kria ...");
	}

	@Override
	public String toString() {
		return "Duck [color=" + color + ", legNumber=" + legNumber + "]";
	}
	
	
}
