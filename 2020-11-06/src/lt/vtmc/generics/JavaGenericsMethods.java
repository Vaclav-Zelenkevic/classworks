package lt.vtmc.generics;

public class JavaGenericsMethods {

	public static void main(String[] args) {
		Integer[] integerArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		String[] stringsArray = { "1", "2" }; // Object!!!

		System.out.println("Find max element");
		System.out.println(findMax(integerArray));
		System.out.println(findMax(doubleArray));
//		System.out.println(findMax(stringsArray)); // String is not Number!!!
	}

	private static <T extends Number & Comparable<T>> T findMax(T[] array) { // T upper boundary
		T max = array[0];
//		for (int i = 0; i < integerArray.length; i++) {
//			if (integerArray[i] > max) {
//				max = integerArray[i];
//			}
//		}

		for (T element : array) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		return max;
	}

}
