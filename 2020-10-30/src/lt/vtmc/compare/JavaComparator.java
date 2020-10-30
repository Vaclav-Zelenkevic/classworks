package lt.vtmc.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaComparator {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
		animals.add("Cow");

		Collections.sort(animals); // Natural order sorting
		System.out.println(animals);

		Collections.sort(animals, new StringComparator());
		System.out.println(animals);

		List<Integer> numbers = new ArrayList<>();
		numbers.add(45);
		numbers.add(67);
		numbers.add(2);
		numbers.add(-3);

		Collections.sort(numbers);
		System.out.println(numbers);

		Collections.sort(numbers, new IntegerComparator());
		System.out.println(numbers);

		Collections.sort(animals, new Comparator<String>() { // Anonymous class
			@Override
			public int compare(String str1, String str2) {
				if (str1.length() > str2.length()) {
					return 1;
				} else if (str1.length() < str2.length()) {
					return -1;
				}
				return 0;
			}

		});

		System.out.println(animals);
	}

}
