package lt.vtmc.anonymous;

public class Main {

	public static void main(String[] args) {
//		Animal animal = new Animal();
//		animal.eat();
		OtherAnimal otherAnimal = new OtherAnimal();
		otherAnimal.eat();
		
		Animal dog = new Animal() {
			@Override
			public void eat() {
				System.out.println("The dog is eating ...");
			}	
		};
		dog.eat();
		
		AbleToEat cat = new AbleToEat() {
			@Override
			public void eat() {
				System.out.println("The cat is eating ...");
			}
		};
		cat.eat();
	}

}
