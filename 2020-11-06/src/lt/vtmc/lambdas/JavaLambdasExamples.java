package lt.vtmc.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaLambdasExamples {
	public static void main(String[] args) {
		int[] intArray = new int[10];
		List<Integer> list = new ArrayList<>();

		fillArray(intArray);
		fillList(list);

		System.out.println(Arrays.toString(intArray));
		System.out.println(list);

		// All elements in list and array * 2
		for (int i = 0; i < 10; i++) {
			intArray[i] = intArray[i] * 2;
			list.set(i, list.get(i) * 2);
		}

		System.out.println(Arrays.toString(intArray));
		System.out.println(list);

		// Map method
		intArray = Arrays.stream(intArray).map(x -> x * 3).map(x -> x + x).toArray();
//		Arrays -> [1,2,3] -> stream (1 -> 2 -> 3) 
//								map->|  ->|  ->|
//						     stream(1*3  2*3  3*3) -> toArray [3, 6, 9]

		System.out.println(Arrays.toString(intArray));
		list = list.stream().map(x -> x / 2).collect(Collectors.toList());
		System.out.println(list);
	}

	private static void fillList(List<Integer> list) {
		for (int i = 0; i < 10; i++) {
			list.add(i + 1);
		}
	}

	private static void fillArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
		}
	}
}
