package lt.vtmc.generics;

import java.util.ArrayList;
import java.util.List;

public class JavaGenericsWilcards {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(5);
		ints.add(-1);
		List<Double> doubles = new ArrayList<>();
		doubles.add(2.45);
		doubles.add(1.45);
		doubles.add(5.69);
		List<String> stringers = new ArrayList<>();
		stringers.add("1");
		stringers.add("2");
		stringers.add("3");
		double sum1 = sum(ints);
		System.out.println(sum1);
		double sum2 = sum(doubles);
		System.out.println(sum2);
//		double sum3 = sum(stringers);
//		System.out.println(sum3);

		printData(ints);
		printData(doubles);
		printData(stringers);

		addInteger(ints);
//		addInteger(doubles);
	}

	private static void addInteger(List<? super Integer> list) { // Lower bounded wildcard
		list.add(12);
	}

	private static void printData(List<?> list) {
		System.out.println(list.getClass().getCanonicalName());
		for (Object object : list) {
			System.out.printf(" %s ", object);
		}
		System.out.println();
	}

	private static double sum(List<? extends Number> list) { // Upper bounded wildcard
		double sum = 0;
		for (Number number : list) {
			sum += number.doubleValue();
		}
		return sum;
	}

}
