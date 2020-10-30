package lt.vtmc.hashequals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaHashEquals {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();

		map.put(1, "Tomas");
		map.put(1, "Tomas");

		set.add(1);
		set.add(1);

		System.out.println(map);
		System.out.println(set);

		Map<People, String> mapObjects = new HashMap<>();
		Set<People> setObjects = new HashSet<>();

		People people1 = new People(1, "Good");
		People people2 = new People(1, "Good");

		System.out.println(people1.hashCode());
		System.out.println(people2.hashCode());
		System.out.println(people1 == people2);
		System.out.println(people1.equals(people2));

		mapObjects.put(people1, "2000");
		mapObjects.put(people2, "5000");

		setObjects.add(people1);
		setObjects.add(people2);

		System.out.println(mapObjects);
		System.out.println(setObjects);
	}

}
