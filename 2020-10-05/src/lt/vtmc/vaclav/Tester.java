package lt.vtmc.vaclav;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Alfredas", 12);
		Dog dog1 = new Dog("Sarikas", 10);
		
		cat1.eating();
		cat1.setName("Isa");
		System.out.println(cat1.getName());
		
		dog1.eating();
		
		Animal animal1 = new Dog("Pupis", 5);
		animal1.eating();
		animal1.eating();
		
		printAnimal(cat1);
		printAnimal(dog1);
		printAnimal(animal1);
		
		Lion lion1 = new Lion("Liutas", 20);
		
//		if (lion1 instanceof Dog) {
//			System.out.println("Yes");
//		}
		
		Vector[] newVector = Vector.generateVectorsArray(20);
		System.out.println(Arrays.toString(newVector));
	}
	
	public static void printAnimal(Animal animal) {
		System.out.println(animal);
	}

}
