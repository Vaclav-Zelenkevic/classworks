package lt.vtmc.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JavaLinkedList {

	public static void main(String[] args) {
		List<String> names = new LinkedList<>(); // null <-> el1 <-> el2 <-> null
		names.add("Tomas");
		names.add("Rita");
		names.add("Akvile");
		System.out.println(names);
		System.out.println(names.get(1));
		// For, Foreach
		List<String> otherNames = new ArrayList<>(3);
		otherNames.add("");
		otherNames.add("");
		otherNames.add("");
//		otherNames = names; // One list for Linked and Array list
//		System.out.println(otherNames);
//		System.out.println(otherNames.equals(names));
//		System.out.println(otherNames == names);
//		otherNames.add("Timi");
//		System.out.println(otherNames);
//		System.out.println(otherNames.equals(names));
//		System.out.println(otherNames == names);
//		System.out.println(names);
		System.out.println(names.size());
		System.out.println(otherNames.size());
		Collections.copy(otherNames, names); // For!
		otherNames.add("Other");
		System.out.println(names);
		System.out.println(otherNames);
	}

}
