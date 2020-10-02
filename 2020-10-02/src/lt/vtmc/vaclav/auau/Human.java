package lt.vtmc.vaclav.auau;

public class Human {
	String name;
	
	Dog dog;
	String room;

	public Human(String name, String dogName) {
		dog = new Dog(dogName);
		this.name = name;
	}
	
	public void sayEat() {	
		dog.eting();
	}
	
	public boolean say() {
		return true;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + "]";
	}

}
