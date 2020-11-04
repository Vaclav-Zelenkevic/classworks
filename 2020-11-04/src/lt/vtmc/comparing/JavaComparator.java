package lt.vtmc.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaComparator {

	public static void main(String[] args) {
		List<People> peoples = new ArrayList<>(); // TreeSet or TreeMap
		peoples.add(new People(31, "Katy"));
		peoples.add(new People(45, "Richard"));
		peoples.add(new People(2, "Teddy"));
		peoples.add(new People(16, "Timi"));
		peoples.add(new People(125, "Anthony"));

		Collections.sort(peoples, new Comparator<People>() { // Anonymous class
			@Override
			public int compare(People o1, People o2) {
				if (o1.getName().charAt(0) < o2.getId()) { // o1.getName. ...
					return -1;
				} else if (o1.getId() > o2.getId()) {
					return 1;
				}
				return 0;
			}
		});

		System.out.println(peoples);

		List<Person> persons = new ArrayList<>();
		persons.add(new Person(54, "Tomas", "12345678"));
		persons.add(new Person(12, "Mantas", "12345678"));
		persons.add(new Person(-45, "Mindaugas", "12345678"));

		Collections.sort(persons);
		System.out.println(persons);
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getId() < o2.getId()) {
					return 1;
				} else if (o1.getId() > o2.getId()) {
					return -1;
				}
				return 0;
			}
		});
		System.out.println(persons);

	}

}
