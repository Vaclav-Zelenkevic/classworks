package lt.vtmc;

public class Main {

	public static void main(String[] args) {
//		Animal animal1 = new Animal();
		
		Animal dog1 = new Dog(-1, "Suo", 12);
		Animal cat1 = new Cat(-2, "Katinas", 5);
		
		System.out.println(dog1.getName());
		dog1.eat();
		cat1.eat();
		dog1.makeSound();
		cat1.makeSound();
		
		Animal duck1 = new Duck(3, "Bubu", 45, true);
		System.out.println(duck1.getName());
		
	}

}
