package lt.vtmc.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMapVariants {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>(); // Neuztikrina eiliskumo (grazinant)
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // grazina taip kaip idejome
		Map<Integer, String> treeMap = new TreeMap<>(); // grazina rusiuota sarasa

		fillMap(hashMap);
		fillMap(linkedHashMap);
		fillMap(treeMap);

		System.out.println(hashMap);
		System.out.println("---------------------");
		System.out.println(linkedHashMap);
		System.out.println("---------------------");
		System.out.println(treeMap);
	}

	private static void fillMap(Map<Integer, String> map) {
		map.put(1, "Red");
		map.put(3, "Yellow");
		map.put(458, "Green");
		map.put(55, "Pink");
		map.put(2, "Unknown");
	}

}
