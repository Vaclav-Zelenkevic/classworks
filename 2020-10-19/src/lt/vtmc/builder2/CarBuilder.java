package lt.vtmc.builder2;

public abstract class CarBuilder {
	Car car;
	
	void createCar() {
		car = new Car();
	}
	
	abstract void buildModel();
	abstract void buildColor();
	abstract void buildPrice();
	
	Car getCar() {
		return car;
	}
}
