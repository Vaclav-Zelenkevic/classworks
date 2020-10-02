package lt.vtmc.vaclav.auau;

public class Cat {
	String name;
	String room;

	public Cat(String name) {
		this.name = name;
	}

	public void run(boolean voice) {
		System.out.println("...");
	}
	
	@Override
	public String toString() {
		return "Miau Miau ...";
	}
}
