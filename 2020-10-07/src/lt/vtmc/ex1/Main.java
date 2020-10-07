package lt.vtmc.ex1;

public class Main {

	public static void main(String[] args) {
		TV television = new TV();
		Radio radio = new Radio();
		Lamp lamp = new Lamp();
		
		switchOn(television);
		switchOn(radio);
		switchOn(lamp);
		
	}

	private static void switchOn(Switchable device) { // Polymorphism
		device.switchOn();
	}

}
