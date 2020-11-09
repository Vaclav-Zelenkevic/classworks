package lt.vtmc.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStreams {

	public static void main(String[] args) {
		int[] intArray = new int[10];
		List<Integer> list = new ArrayList<>();

		fillArray(intArray);
		fillList(list);

		System.out.println("Source");
		System.out.println(Arrays.toString(intArray));
		System.out.println(list);

		// java.util.stream.Stream

		// Map method
		System.out.println("Map method");
		intArray = Arrays.stream(intArray).map(e -> e * 3).toArray();
		list = list.stream().map(e -> e * 4).collect(Collectors.toList());
		System.out.println(Arrays.toString(intArray));
		System.out.println(list);

		// Filter method
		System.out.println("Filter method");
		intArray = Arrays.stream(intArray).filter(e -> e % 2 == 0).toArray();
		list = list.stream().filter(e -> e > 50).collect(Collectors.toList());
		System.out.println(Arrays.toString(intArray));
		System.out.println(list);

		// Foreach method
		System.out.println("Foreach method");
		Arrays.stream(intArray).forEach(e -> System.out.printf("%s ", e));
		System.out.println();
		list.forEach(e -> System.out.print(e + " "));

		// Reduce method
		System.out.println();
		System.out.println("Reduce method");
		int sum1 = Arrays.stream(intArray).reduce((acc, e) -> acc + e).getAsInt();
		System.out.println(sum1);
		int sum2 = list.stream().reduce((acc, e) -> acc * e).get();
		System.out.println(sum2);

		// Max, Min methods
		System.out.println("Max, Min methods");
		int max1 = Arrays.stream(intArray).max().getAsInt();
		System.out.println(max1);
		int max2 = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max2);

		System.out.println("Other methods");
		int[] otherIntArray = new int[10];
		fillArray(otherIntArray);
		Arrays.stream(otherIntArray).filter(e -> e % 2 != 0).map(e -> e + 10).forEach(e -> System.out.print(e + " "));

		System.out.println();
		Set<Integer> set1 = new HashSet<>(); // HashFunction!!!
		fillList(set1);
		System.out.println(set1);
		set1 = set1.stream().map(e -> e / 2).collect(Collectors.toSet());

		// All Collections + Map --> Stream!

	}

	private static void fillList(Collection<Integer> list) {
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 100)); // Operator cast or *
		}
	}

	private static void fillArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 100);
		}
	}

}
