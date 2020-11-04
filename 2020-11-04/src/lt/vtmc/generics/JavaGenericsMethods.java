package lt.vtmc.generics;

public class JavaGenericsMethods {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		String[] stringArray = { "One", "Two", "Three", "Four", "Five" };
		Person[] personList = { new Person(1, "Akvile", "..."), new Person(45, "Eva", "464654566") };

		printArray(intArray);
		printArray(doubleArray);
		printArray(stringArray);
		printArray(personList);

//		printArray(stringArray);
//		Don't repeat yourself!!!

	}

//	private static void printArray(Double[] doubleArray) {
//		System.out.println();
//		System.out.println("Non generic method called!");
//		for (Double element : doubleArray) {
//			System.out.printf("%s ", element);
//		}
//	}
//
//	private static void printArray(Integer[] intArray) {
//		System.out.println("Non generic method called!");
//		for (Integer element : intArray) {
//			System.out.printf("%s ", element);
//		}
//	}

	private static <T> void printArray(T[] array) {
		System.out.println("Generic method called!");
		for (T element : array) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

}
