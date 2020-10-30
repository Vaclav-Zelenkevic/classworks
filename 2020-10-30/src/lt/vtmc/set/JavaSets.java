package lt.vtmc.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSets {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>(); // Set unique elements
		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();

		fillSet(hashSet);
		fillSet(linkedHashSet);
		fillSet(treeSet);

		System.out.println(hashSet);
		System.out.println(linkedHashSet);
		System.out.println(treeSet);

		operationsWithSets();
	}

	private static void operationsWithSets() {
		Set<Integer> set1 = new HashSet<>();
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		Set<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		// Union
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		System.out.println(union);
		// Intersection
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		// Differences
		Set<Integer> difference = new HashSet<>(set2);
		difference.removeAll(set1);
		System.out.println(difference);
	}

	private static void fillSet(Set<String> set) {
		set.add("Teddy");
		set.add("Katy");
		set.add("Krakaziabra");
		set.add("Tomas");
		set.add("Krakaziabra");
	}

}
