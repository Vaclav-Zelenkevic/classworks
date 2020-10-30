package lt.vtmc.list;

import java.util.ArrayList;
import java.util.List;

public class JavaArrayList {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<>(100);
		colors.add("Red");
		colors.add("Green");
		colors.add("Purple");
		System.out.println(colors);

		for (int i = 0; i < colors.size(); i++) {
			System.out.print(colors.get(i) + " ");
		}
		System.out.println();
		for (String element : colors) { // iterator
			System.out.print(element + " ");
		}
		System.out.println();
		colors.clear();
		System.out.println(colors);
		colors.add("Color");
		System.out.println(colors);
		colors.add(1, "Pink"); // java.lang.IndexOutOfBoundsException
		System.out.println(colors);
		System.out.println(colors.contains("Pink"));
		colors.set(1, "Yellow");
		System.out.println(colors);
	}

}
