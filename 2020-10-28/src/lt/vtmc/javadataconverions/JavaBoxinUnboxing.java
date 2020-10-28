package lt.vtmc.javadataconverions;

public class JavaBoxinUnboxing {

	public static void main(String[] args) {
		// Autoboxing
		Integer integerObject = 7; // int?
//		Integer integerObject1 = new Integer(45);
		System.out.println(integerObject);
		Double doubleObject = 4.0;
		System.out.println(doubleObject);
		Boolean booleanObject = true;
		System.out.println(booleanObject);
		// Unboxing
		int intPrimitive = integerObject;
		System.out.println(intPrimitive);
		double doublePrimitive = doubleObject;
		System.out.println(doublePrimitive);
		// Expressions
		Integer integerObjec2 = 10;
		Integer integerObjec3 = 20;
		System.out.println(integerObjec2 + integerObjec3);
		printIntegerObject(integerObjec3);
	}

	private static void printIntegerObject(int number) {
		System.out.println(number);
	}
	
	

}
