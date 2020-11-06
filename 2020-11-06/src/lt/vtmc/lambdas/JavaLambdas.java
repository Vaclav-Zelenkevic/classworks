package lt.vtmc.lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class JavaLambdas {

	public static void main(String[] args) {
		// Lambda anonymous function
		// F(x) = x^2 + 2x + 12 -> kvadratine funkcija, Lisp
		// Select Functional Interface from
		// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

		String[] colors = { "Red", "Green", "Pink", "Yellow" };

		People[] peoples = { new People("Tomas", 25), new People("Jovita", 20), new People("Morka", 49),
				new People("Saule", 41), };

		System.out.println(Arrays.toString(colors));
		System.out.println(Arrays.toString(peoples));

		Arrays.sort(colors, new Comparator<String>() { // class Anonymous implements Comparator {} --> compiler
			@Override
			public int compare(String s1, String s2) {
				return s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1);
			}
		});

		System.out.println(Arrays.toString(colors));

		Arrays.sort(colors, (s1, s2) -> { // Lambda function
			return s1.charAt(s1.length() - 2) - s2.charAt(s2.length() - 2);
		});

		System.out.println(Arrays.toString(colors));

		Arrays.sort(peoples, (p1, p2) -> {
			if (p2.getAge() - p1.getAge() != 0) {
				return p2.getAge() - p1.getAge();
			} else {
				return p1.getName().compareTo(p2.getName());
			}
		});

		System.out.println(Arrays.toString(peoples));
	}

}
