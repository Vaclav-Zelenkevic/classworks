package lt.vtmc.enumerate;

public enum Vat {
	PRODUCT(1.18), MEDICINE(1.05), PRESS(1.09);

	private double vat;

	private Vat(double vat) {
		this.vat = vat;
	}

	public double getVat() {
		return vat;
	}

}
