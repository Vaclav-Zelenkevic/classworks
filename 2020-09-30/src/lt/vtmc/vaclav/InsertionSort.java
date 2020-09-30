package lt.vtmc.vaclav;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] numbers = new int[200000];
		long startFill = System.currentTimeMillis();
		fillNumberArray(numbers);
//		System.out.println(Arrays.toString(numbers));
		System.out.println("Time: " + ((System.currentTimeMillis() - startFill)));
		long startSort = System.currentTimeMillis();
		getSortedNumbers(numbers);
//		System.out.println(Arrays.toString(numbers));
		System.out.println("Time: " + ((System.currentTimeMillis() - startSort)));

	}

	private static int[] fillNumberArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
		return numbers;
	}

	static int[] getSortedNumbers(int[] numbers) {
		
		for(int i = 0; i < numbers.length; i++) {
			int key = numbers[i];
			int j = i - 1;
			while(j >= 0 && numbers[j] > key) {
				numbers[j + 1] = numbers[j];
				j = j - 1;
			}
			numbers[j + 1] = key;
		}
		return numbers;
	}

}
