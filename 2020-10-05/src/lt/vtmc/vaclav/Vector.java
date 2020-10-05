package lt.vtmc.vaclav;

public class Vector {
	private static double x;
	private static double y;
	private static double z;
	
	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static double lenght() {
		return Math.sqrt(x * x + y * y + z * z);
	}
	
	public static double scalarVectorMultiply(Vector vector) {
		return x * vector.x + y * vector.y + z * vector.z;
	}
	
	public static Vector[] generateVectorsArray(int number) {
		Vector[] vectors = new Vector[number];
		for (int i = 0; i < vectors.length; i++) {
			vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
		}
		return vectors;
	}

	@Override
	public String toString() {
		return "Vector [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
}
