package lt.vtmc.vaclav;

public class Animal {
	private String name = "Anything";
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eating() {
		System.out.println("An animal is eating ...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
