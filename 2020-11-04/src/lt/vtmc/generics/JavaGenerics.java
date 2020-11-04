package lt.vtmc.generics;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

	public static void main(String[] args) {
		BoxOne box1 = new BoxOne(1); // Integer objects
		System.out.println(box1);
		BoxTwo box2 = new BoxTwo("2"); // String objects
		System.out.println(box2);
		BoxThree box3 = new BoxThree(new Object()); // Objects
		System.out.println(box3);

		String name = "Tadas";
//		int name = 12;

		List list = new ArrayList(); // Java < 1.5
		if (name instanceof String) {
			list.add(name); // RunTime exceptions!!!
		}
//		list.add(1);

		for (Object object : list) {
			System.out.println("-" + (String) object);
		}

		Box<Double> box4 = new Box<>(1.2D);
		Box<String> box5 = new Box<>("1");
		Box<Object> box6 = new Box<>(new Object());

		List<Integer> integerNumbers = new ArrayList<>(); // Java > 1.5
		integerNumbers.add(1);
//		integerNumbers.add("1"); // Can't add!!!

	}

}
