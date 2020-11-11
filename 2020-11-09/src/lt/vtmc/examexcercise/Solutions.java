package lt.vtmc.examexcercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;
import lt.itakademija.exam.test.BaseTest;

public class Solutions extends BaseTest {

	@Override
	protected Exercises createExercises() {
		return new Exercises() {

			@Override
			public boolean isSameObject(Object o1, Object o2) {
				return o1.equals(o2);
			}

			@Override
			public boolean isEqual(Object o1, Object o2) {
				return o1.equals(o2);
			}

			@Override
			public Integer findSmallest(List<Integer> numbers) {
				return Collections.min(numbers);
			}

			@Override
			public Integer findLargest(List<Integer> numbers) {
//				return numbers.stream().max(Comparator.comparingInt(Integer::intValue)).get();
				return Collections.max(numbers);
			}

			@Override
			public IntegerGenerator createIntegerGenerator(int i1, int i2) {
				List<Integer> ints = IntStream.rangeClosed(i1 - 1, i2).boxed().collect(Collectors.toList());
				return new IntegerGenerator() {
					int index = 0;

					@Override
					public Integer getNext() {
						index++;
//						return (ints.size() > index) ? ints.get(index) : null; // Good practice
						if (ints.size() > index) {
							return ints.get(index);
						} else {
							return null;
						}
					}
				};
			}

			@Override
			public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator arg0, NumberFilter arg1) {
				// TODO
				return null;
			}

			@Override
			public Map<Integer, Integer> countOccurrences(List<Integer> numbers) {
				return numbers.stream().collect(
						Collectors.groupingBy(Integer::intValue, Collectors.reducing(0, e -> 1, Integer::sum)));
			}

			@Override
			public List<Integer> consume(Iterator<Integer> it) {
				return new ArrayList<>();
			}

			@Override
			public int computeSumOfNumbers(int number, NumberFilter filter) {
				List<Integer> numbers = IntStream.iterate(1, a -> a + 1).limit(number).boxed()
						.collect(Collectors.toList());
				int sum = 0;
				for (Integer element : numbers) {
					if (filter.accept(element)) {
						sum = sum + element;
					}
				}
				return sum;
			}

			@Override
			public int computeSumOfNumbers(int number) {
				return IntStream.iterate(1, a -> a + 1).limit(number).reduce(Integer::sum).getAsInt();
			}

			@Override
			public List<Integer> computeNumbersUpTo(int number) {
				return IntStream.iterate(1, a -> a + 1).limit(number - 1).boxed().collect(Collectors.toList());
			}
		};
	}

}
