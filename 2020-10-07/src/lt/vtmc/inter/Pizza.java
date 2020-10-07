package lt.vtmc.inter;

public class Pizza extends Item implements ItemAbleToReturn {

	private String size;
	// TODO
	
	public Pizza(String name, double price, int quantity, String size) {
		super(name, price, quantity);
		this.size = size;
	}

	@Override
	public double getDeliveryPrice() {
		if (getPrice() > 10 || getQuantity() > 2 || this.size.equals("30cm")) {
			return 0.0;
		} else {
			return 5;
		}
	}

	@Override
	public boolean canReturn() {
		
		return false;
	}

}
