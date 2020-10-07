package lt.vtmc.inter;

public class Phone extends Item implements Deliverable{

	public Phone(String name, double price, int quantity) {
		super(name, price, quantity);
	}

	@Override
	public double getDeliveryPrice() {
		if (getPrice() > 200) {
			return 0.0;
		} else {
			return 15;
		}
	}

}
