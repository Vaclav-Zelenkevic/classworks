package lt.vtmc.enumerate;

public class Product extends AbstractItem {

	public Product(double price, String name) {
		super(price, name);
	}

	@Override
	double getPriceWithVat() {
		return this.getPrice() * Vat.PRODUCT.getVat();
	}
}
