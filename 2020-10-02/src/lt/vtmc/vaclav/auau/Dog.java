package lt.vtmc.vaclav.auau;

public class Dog {
	String name;
	String room;

	public Dog(String name) {
		this.name = name;
	}
	
	public void eting() {
		System.out.println("Dog is eating ...");
	}

	@Override
	public String toString() {
		return "Au Au ..";
	}
	
	
}
