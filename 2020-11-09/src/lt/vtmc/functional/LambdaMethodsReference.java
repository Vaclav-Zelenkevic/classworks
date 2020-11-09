package lt.vtmc.functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaMethodsReference {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Akvile", 25));
		persons.add(new Person("Toma", 34));
		persons.add(new Person("Ieva", 20));
		persons.add(new Person("Margarita", 27));

		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getAge() - p2.getAge();
			}

		});

		System.out.println(persons);

		Collections.sort(persons, (p1, p2) -> {
			return p1.getAge() - p2.getAge();
		});
		System.out.println(persons);

		Collections.sort(persons, Comparator.comparingInt(Person::getAge)); // Method reference
		System.out.println(persons);

		// Methods reference
		// 1. Class::staticMethod - for static context
		String name = "Vaclav";
		Double number = 125.45;
		TransformationUtilities<String> strTransformationUtilities = new TransformationUtilities<>();
		System.out.println(strTransformationUtilities.transform(name, TransformationUtilities::kazkas));
		TransformationUtilities<Double> dbTransformationUtilities = new TransformationUtilities<>();
		System.out.println(dbTransformationUtilities.transform(number, Math::sin));
		System.out.println(dbTransformationUtilities.transform(number, e -> Math.sin(e)));
		// 2. ClassInstance::nonStaticMethod - for non-static context
		String surname = "Katinas ";
		System.out.println(strTransformationUtilities.transform(name, surname::concat));
		// 3. Class::nonStaticMethod
		String lang = "Java";
		System.out.println(strTransformationUtilities.transform(lang, String::toUpperCase));
		// 4. Class::new
		System.out.println(strTransformationUtilities.transform(lang, String::new));
	}

}
