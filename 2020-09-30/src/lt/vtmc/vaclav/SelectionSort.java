package lt.vtmc.vaclav;

import java.util.Arrays;

public class SelectionSort {

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
	
	private static int[] getSortedNumbers(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			int minArrayElement = i;
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[minArrayElement] > numbers[j]) {
					minArrayElement = j;
				}
			}
			
			if(minArrayElement != i) {
				int temp = numbers[i];
				numbers[i] = numbers[minArrayElement];
				numbers[minArrayElement] = temp;
			}
		}
		return numbers;
	}

	private static int[] fillNumberArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
		return numbers;
	}

}
