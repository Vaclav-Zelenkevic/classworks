package lt.vtmc.decorator1;

public class HeatingSeat extends CarDecorator{

	public HeatingSeat(Car car) {
		super(car);
	}
	
	@Override
	public int getPrice() {
		return car.getPrice() + 1000;
	}

	@Override
	public String getCarTuning() {
		return car.getCarTuning() + ", heating seat";
	}
	
}
