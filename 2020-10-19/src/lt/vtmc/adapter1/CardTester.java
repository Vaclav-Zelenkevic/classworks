package lt.vtmc.adapter1;

public class CardTester {

	public static void main(String[] args) {
		USB usb = new CardReaderAdapter(new MicroSDMemoryCard());
		usb.connectUsb();
	}

}
