package lt.vtmc.comparing;

import java.util.ArrayList;
import java.util.List;

public class JavaIterable {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); // int --> Integer (Autoboxing)
		list.add(1); // 0
		list.add(2); // 1
		list.add(4); // 2

		System.out.println(list);
		System.out.println(list.get(0) + 100); // Unboxing

//		list.remove(0);

		for (Integer integer : list) { // Pasleptas indeksas (Foreach)
			System.out.print(integer + " ");
			System.out.println(integer.getClass().getName());
		}

		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i) + 10);
		}

		System.out.println(list);
//
//		Iterator<Integer> iterator = list.iterator();
//		int index = 0;
//		while (iterator.hasNext()) {
//			// TODO
//			if (index == 1) {
//				iterator.remove();
////				list.add(index + 1);
//				index++;
//			}
//		}
//
//		System.out.println(list.size());

	}

}
