package lt.vtmc.enumerate;

public enum Season {
	SPRING("Pavasaris", 12), // Object --> singleton
	SUMMER("Vasara", 28), AUTUMN("Ruduo", 16), WINTER("Žiema", -10); // constant (public static final) --> singleton

	private String translation;
	private double temperature;

	private Season(String translation, double temperature) {
		this.translation = translation;
		this.temperature = temperature;
	}

	public String getTranslation() {
		return translation + " Netikras pavadinimas";
	}

	public double getTemperature() {
		return temperature;
	}

}
