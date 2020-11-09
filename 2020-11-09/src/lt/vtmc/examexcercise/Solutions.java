package lt.vtmc.examexcercise;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;
import lt.itakademija.exam.test.BaseTest;

public class Solutions extends BaseTest {

	@Override
	protected Exercises createExercises() {
		return new Exercises() {

			@Override
			public boolean isSameObject(Object arg0, Object arg1) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isEqual(Object arg0, Object arg1) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Integer findSmallest(List<Integer> arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Integer findLargest(List<Integer> arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public IntegerGenerator createIntegerGenerator(int arg0, int arg1) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator arg0, NumberFilter arg1) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Map<Integer, Integer> countOccurrences(List<Integer> arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List<Integer> consume(Iterator<Integer> arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int computeSumOfNumbers(int arg0, NumberFilter arg1) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int computeSumOfNumbers(int arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public List<Integer> computeNumbersUpTo(int arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

}
