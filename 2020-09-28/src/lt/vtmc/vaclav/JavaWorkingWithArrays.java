package lt.vtmc.vaclav;

import java.util.Arrays;

public class JavaWorkingWithArrays {

	public static void main(String[] args) {
		int[] numbers = {0,1,2,3,4,5,6,7,8,9};
		printArray(numbers);
		int[] otherNumbers = generateArray(5000000);
		insertElementInArray(otherNumbers, 89);
	}

	private static void insertElementInArray(int[] otherNumbers, int number) {
		double start = System.currentTimeMillis();
		int[] newOtherNumbers = new int[otherNumbers.length + 1];
		for (int i = 0; i < otherNumbers.length; i++) {
			newOtherNumbers[i] = otherNumbers[i];
		}
		newOtherNumbers[newOtherNumbers.length - 1] = number;
		double end = System.currentTimeMillis();
		System.out.println("Time: " + (end - start) / 1000);
	}

	private static int[] generateArray(int number) {
		double start = System.currentTimeMillis();
		int[] numbers = new int[number];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*100);
		}
		double end = System.currentTimeMillis();
		System.out.println("Time: " + (end - start) / 1000);
		return numbers;
	}

	private static void printArray(int[] numbers) {
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + ", "); // String
//		}
		
		System.out.println("\n" + Arrays.toString(numbers));
		
//		for(int number: numbers) { // foreach
//			System.out.print(number + ", ");
//		}
	}

}
