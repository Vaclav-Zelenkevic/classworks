package lt.vtmc.builder1;

public class CarShop {

	public static void main(String[] args) {
		Car car = new Car();
		car.setModel("X5");
		car.setColor("Black");
		car.setPrice(30000);
		
		System.out.println(car);
	}

}
