package lt.vtmc.builder2;

public class ModelOneCarBuilder extends CarBuilder{

	@Override
	void buildModel() {
		car.setModel(Model.YARIS);	
	}

	@Override
	void buildColor() {
		car.setColor("Red");		
	}

	@Override
	void buildPrice() {
		car.setPrice(24788);
	}

}
