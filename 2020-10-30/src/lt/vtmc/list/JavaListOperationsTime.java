package lt.vtmc.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class JavaListOperationsTime {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
//		measureFillTime(arrayList);
//		measureFillTime(linkedList);
//		measureReadTime(arrayList);
//		measureReadTime(linkedList);
//		measureAddAsFirstElement(arrayList);
//		measureAddAsFirstElement(linkedList);
		measureAddRandomElementTime(arrayList);
		measureAddRandomElementTime(linkedList);
//		measureRemoveLastElementTime(arrayList);
//		measureRemoveLastElementTime(linkedList);
//		measureRemoveFirstElementTime(arrayList);
//		measureRemoveFirstElementTime(linkedList);
//		measureRemoveRandomElementTime(arrayList);
//		measureRemoveRandomElementTime(linkedList);
	}

	private static void measureRemoveRandomElementTime(List<Integer> list) {
		measureFillTime(list);
		long startTime = System.currentTimeMillis();
		Random random = new Random();
		for (int i = 0; i < 50000; i++) {
			list.remove(random.nextInt(50000));
		}
		long stopTime = System.currentTimeMillis();
		System.out.println(
				list.getClass().getSimpleName() + " add as random element time " + (stopTime - startTime) + " mS");
	}

	private static void measureRemoveFirstElementTime(List<Integer> list) {
		measureFillTime(list);
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.remove(0);
		}
		long stopTime = System.currentTimeMillis();
		System.out.println(
				list.getClass().getSimpleName() + " remove last element time " + (stopTime - startTime) + " mS");
	}

	private static void measureRemoveLastElementTime(List<Integer> list) {
		measureFillTime(list);
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.remove(list.size() - 1);
		}
		long stopTime = System.currentTimeMillis();
		System.out.println(
				list.getClass().getSimpleName() + " remove last element time " + (stopTime - startTime) + " mS");
	}

	private static void measureAddRandomElementTime(List<Integer> list) {
		measureFillTime(list);
		long startTime = System.currentTimeMillis();
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			list.add(random.nextInt(100000), i);
		}
		long stopTime = System.currentTimeMillis();
		System.out.println(
				list.getClass().getSimpleName() + " add as random element time " + (stopTime - startTime) + " mS");
	}

	private static void measureAddAsFirstElement(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.add(0, i);
		}
		long stopTime = System.currentTimeMillis();
		System.out.println(
				list.getClass().getSimpleName() + " add as first element time " + (stopTime - startTime) + " mS");
	}

	private static void measureReadTime(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.get(i);
		}
		long stopTime = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " linear read time " + (stopTime - startTime) + " mS");
	}

	private static void measureFillTime(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}
		long stopTime = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " linear fill time " + (stopTime - startTime) + " mS");
	}

}
