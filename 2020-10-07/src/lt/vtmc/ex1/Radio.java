package lt.vtmc.ex1;

public class Radio implements Switchable{

	@Override
	public void switchOn() {
		System.out.println("Radio On");
	}

	@Override
	public void switchOff() {
		System.out.println("Radio Off");	
	}

}
