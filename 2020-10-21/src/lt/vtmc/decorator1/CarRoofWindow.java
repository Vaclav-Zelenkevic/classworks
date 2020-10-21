package lt.vtmc.decorator1;

public class CarRoofWindow extends CarDecorator{

	public CarRoofWindow(Car car) {
		super(car);
	}
	
	@Override
	public int getPrice() {
		return car.getPrice() + 2000;
	}

	@Override
	public String getCarTuning() {
		return car.getCarTuning() + ", Roof window ...";
	}

}
