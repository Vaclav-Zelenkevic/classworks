package lt.vtmc.builder2;

public class Director {
	CarBuilder builder;
	
	public void setBuilder(CarBuilder builder) {
		this.builder = builder;
	}
	
	Car buildCar() {
		builder.createCar();
		builder.buildModel();
		builder.buildColor();
		builder.buildPrice();
		Car car = builder.getCar();
		return car;
	}
}
