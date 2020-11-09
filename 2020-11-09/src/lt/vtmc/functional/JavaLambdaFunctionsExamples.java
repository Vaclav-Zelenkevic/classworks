package lt.vtmc.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class JavaLambdaFunctionsExamples {

	public static void main(String[] args) {
		List<Human> humans = new ArrayList<>();
		humans.add(new Human("Jurgita", 24, 1000));
		humans.add(new Human("Tadas", 25, 1010));
		humans.add(new Human("Monika", 27, 1700));
		humans.add(new Human("Akvile", 32, 2500));
		humans.add(new Human("Jurgis", 19, 800));

		// Predicate interface
		System.out.println(findMatch(humans, e -> e.getSalary() < 1200));
		// Function interface
		System.out.println(calculateSalarySum(humans, Human::getSalary));
		// Consumer interface
		humans.forEach(e -> e.setSalary(e.getSalary() * 11 / 10));
		humans.forEach(System.out::println);
	}

	private static <T> Integer calculateSalarySum(List<T> list, Function<T, Integer> function) {
		int sum = 0;
		for (T element : list) {
			sum = sum + function.apply(element);
		}
		return sum; // list.size(); for avg count
	}

	private static <T> T findMatch(List<T> list, Predicate<T> predicateFunction) {
		for (T element : list) {
			if (predicateFunction.test(element)) {
				return element;
			}
		}
		return null;
	}

}
