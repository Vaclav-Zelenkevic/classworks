package lt.vtmc.decorator1;

public class CarDecorator implements Car{

	protected final Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}
	
	@Override
	public int getPrice() {
		return car.getPrice();
	}

	@Override
	public String getCarTuning() {
		return car.getCarTuning();
	}
	
}
