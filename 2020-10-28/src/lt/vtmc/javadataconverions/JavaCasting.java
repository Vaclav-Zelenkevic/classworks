package lt.vtmc.javadataconverions;

public class JavaCasting {

	public static void main(String[] args) {
		// Explicit casting !!! lost data
		double doubleNumber = 112.0d; // double -> 8B
		float floatNumber = (float) doubleNumber;  // float -> 4B
		System.out.println(floatNumber);
		int intNumber = 458;
		short shortNumber = (short) intNumber;
		System.out.println(shortNumber);
		// Implicit casting !!! safe
		byte byteNumber = 45;
		int intNumber1 = byteNumber;
		double db1 = byteNumber;
		System.out.println(intNumber1);
		System.out.println(db1);
		// Object casting
		Animal animal = new Animal();
		animal.eat();
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
		// Upcasting
		Animal otherAnimal = new Dog();
		otherAnimal.eat();
		// Downcasting !!! Not safe
		Dog otherDog = (Dog) otherAnimal;
		otherDog.eat();
		otherDog.bark();
		
		Animal anAnimal = new Animal();
		Dog anDog = (Dog) anAnimal;
		anDog.bark(); // java.lang.ClassCastException !!!
	}

}
