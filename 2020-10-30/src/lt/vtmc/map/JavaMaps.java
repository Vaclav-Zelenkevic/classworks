package lt.vtmc.map;

import java.util.HashMap;
import java.util.Map;

public class JavaMaps {

	public static void main(String[] args) {
		Map<Integer, String> names = new HashMap<>();
		names.put(1, "Tomas");
		names.put(2, "Teddy");
		names.put(3, "Tomas");

		System.out.println(names);
		names.put(2, "Katinas"); // Ovveride
		System.out.println(names);

		for (Map.Entry<Integer, String> entry : names.entrySet()) {
			if (entry.getValue().equals("Tomas")) {
				System.out.println(entry.getKey());
			}
		}
	}

}
