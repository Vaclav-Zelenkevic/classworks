package lt.vtmc.factory1;

public class FactoryMain {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape("Circle");
		shape.draw();
	}
}
