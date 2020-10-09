package lt.vtmc.shop;

public abstract class AbstractProduct {
	private String name;
	private double price;
	
	public AbstractProduct(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public double getPriceWithVat() {
		return this.price * getVat();
	}
	
	public abstract double getVat();

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
}
