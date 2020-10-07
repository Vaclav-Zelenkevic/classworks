package lt.vtmc.inter;

public class Main {

	public static void main(String[] args) {
		Phone nokia = new Phone("3310", 60, 1);
		Pizza margarita = new Pizza("Margarita", 8.9, 12, "42cm");
		
		System.out.println(nokia.getDeliveryPrice());
		System.out.println(margarita.getDeliveryPrice());
	}

}
