package lt.vtmc.builder2;

public class CarShop {
	public static void main(String[] args) {
		Director director = new Director();
		director.setBuilder(new ModelOneCarBuilder());
		Car car = director.buildCar();
		
		System.out.println(car);
		
		director.setBuilder(new ModelTwoCarBuilder());
		Car car2 = director.buildCar();
		System.out.println(car2);
	}
}
