package lt.vtmc.decorator1;

public class BaseCar implements Car{

	@Override
	public int getPrice() {
		return 13000;
	}

	@Override
	public String getCarTuning() {
		return "Base car configuration ...";
	}
	
}
