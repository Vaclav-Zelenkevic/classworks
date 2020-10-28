package lt.vtmc.javacollections.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class JavaList {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
//		numbers[20] = 45; // Exception
		int[] otherNumbers = new int[5];
		int index = 4;
		for (int i = 0; i < index; i++) {
			otherNumbers[i] = i;
		}
		
		System.out.println();
		ArrayList<Integer> integerNumbers = new ArrayList<>(10000000); // Only object accept
		integerNumbers.add(12);
		Integer number = 28;
		integerNumbers.add(number);
		System.out.println(integerNumbers);
//		System.out.println(integerNumbers.get(2)); // Exception
		integerNumbers.add(0, 36);
		System.out.println(integerNumbers);
		LinkedList<Integer> linkedNumbers  = new LinkedList<>();
		linkedNumbers.add(46);
		linkedNumbers.size();
		
	}

}
