package lt.vtmc.generics;

public class Fruit {
	private String name;
	private int quantity;

	public Fruit(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", quantity=" + quantity + "]";
	}

}
