package lt.vtmc.ex1;

public class TV implements Switchable{

	@Override
	public void switchOn() {
		System.out.println("TV On");
	}

	@Override
	public void switchOff() {
		System.out.println("TV Off");	
	}

}
