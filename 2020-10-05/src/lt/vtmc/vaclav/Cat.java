package lt.vtmc.vaclav;

public class Cat extends Animal{
	
	private String name;
	
	public Cat(String name, int age) {
		super(name, age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void eating() {
		System.out.println("An cat is eating ...");
	}
	
}