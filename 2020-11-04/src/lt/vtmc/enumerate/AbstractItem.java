package lt.vtmc.enumerate;

public abstract class AbstractItem {
	private double price;
	private String name;

	public AbstractItem(double price, String name) {
		this.price = price;
		this.name = name;
	}

	abstract double getPriceWithVat();

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

}
