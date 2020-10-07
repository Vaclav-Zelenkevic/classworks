package lt.vtmc.ex1;

public class Lamp implements Switchable{

	@Override
	public void switchOn() {
		System.out.println("Lamp On");
	}

	@Override
	public void switchOff() {
		System.out.println("Lamp Off");	
	}

}
