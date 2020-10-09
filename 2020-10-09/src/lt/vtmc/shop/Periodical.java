package lt.vtmc.shop;

public class Periodical extends AbstractProduct implements AbleToPutToBasket{

	private static final double PERIODICAL_VAT = 1.09;
	
	public Periodical(String name, double price) {
		super(name, price);
	}

	@Override
	public double getVat() {
		return PERIODICAL_VAT;
	}

}
