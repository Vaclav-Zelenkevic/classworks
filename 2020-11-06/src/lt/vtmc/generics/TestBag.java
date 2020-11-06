package lt.vtmc.generics;

public class TestBag {

	public static void main(String[] args) {
		Bag<String> stringBag = new Bag<>();
		stringBag.add("Katinas");
		stringBag.add("Suo");
		stringBag.add("Telefonas");

		for (String element : stringBag) {
			System.out.printf("%s ", element);
		}

		System.out.println();

		System.out.println(stringBag);

		Bag<Integer> integerBag = new Bag<Integer>();
		integerBag.add(1);
		integerBag.add(2);
		integerBag.add(3);

		System.out.println(integerBag);

		Bag<Fruit> fruitsBag = new Bag<>();
		fruitsBag.add(new Fruit("Persikas", 2));
		fruitsBag.add(new Fruit("Obuoliai", 5));
		fruitsBag.add(new Fruit("Bananas", 1));

		System.out.println(fruitsBag);
	}

}
