package lt.vtmc.factory1;

public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			throw new NullPointerException();
		}
		if (shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		if (shapeType.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		}
		if (shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null; // No good!
	}

}
