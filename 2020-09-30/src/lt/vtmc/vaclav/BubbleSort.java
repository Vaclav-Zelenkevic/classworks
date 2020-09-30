package lt.vtmc.vaclav;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers = new int[100000];
		long startFill = System.currentTimeMillis();
		fillNumberArray(numbers);
		System.out.println("Time: " + ((System.currentTimeMillis() - startFill)) / 1000);
		long startSort = System.currentTimeMillis();
		getSortedNumbers(numbers);
//		Arrays.sort(numbers);
		System.out.println("Time: " + ((System.currentTimeMillis() - startSort)) / 1000);
		
	}

	private static int[] fillNumberArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
		return numbers;
	}

	static int[] getSortedNumbers(int[] numbers) {
		boolean isSorted = false;
		int temp;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					isSorted = false;
					temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
				}
			}
		}
		return numbers;
	}
}
