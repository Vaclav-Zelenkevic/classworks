package lt.vtmc.decorator1;

public class DecoratorMain {
	public static void main(String[] args) {
		Car car = new CarRoofWindow(new HeatingSeat(new BaseCar()));
		System.out.println("Price: " + car.getPrice() + " Car tuning: " + car.getCarTuning());
	}
}
