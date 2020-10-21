package lt.vtmc.builder2;

public class ModelTwoCarBuilder extends CarBuilder{

	@Override
	void buildModel() {
		car.setModel(Model.YARIS_VERSO);	
	}

	@Override
	void buildColor() {
		car.setColor("Black");		
	}

	@Override
	void buildPrice() {
		car.setPrice(29999);
	}

}
