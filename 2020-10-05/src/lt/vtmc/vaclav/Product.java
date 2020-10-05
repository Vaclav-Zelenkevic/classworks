package lt.vtmc.vaclav;

public class Product {
	private String name;
	private double price;
	private static final double PVM = 0.15;

//	public Product() {}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPvm() {
		return PVM;
	}
	
	public double getPriceWithPvm() {
		return this.price + (this.price * this.PVM);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
}
