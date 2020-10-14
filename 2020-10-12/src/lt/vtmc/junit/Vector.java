package lt.vtmc.junit;

public class Vector {

	private double x;
	private double y;
	
	public Vector() {}

	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getLenght() {
		return Math.sqrt(x * x + y * y);
	}

	@Override
	public String toString() {
		return "Vector [x=" + x + ", y=" + y + "]";
	}

}
