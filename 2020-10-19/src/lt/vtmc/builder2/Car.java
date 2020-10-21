package lt.vtmc.builder2;

public class Car {

	private Model model;
	private String color;
	private int price;
	
	public void setModel(Model model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	
}
