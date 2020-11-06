package lt.vtmc.generics;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

	public static void main(String[] args) {
		// in Java 1.4
		ArrayList names = new ArrayList(); // No type
		names.add(12);
		names.add("Akvile");

//		String teacher1 = (String) names.get(0); // ClassCastException -> RunTime error!
		// from Java 1.5
		List<String> words = new ArrayList<>();
//		words.add(12); // AutoBoxing 12 -> Integer
		int[] ints = {}; // Type --> int
// List (ArrayList, LinkedList), Set(HashSet, LinkedHashSet, TreeSet), Map(HashMap, LinkedHashMap, TreeMap)
	}

}
