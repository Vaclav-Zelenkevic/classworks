package lt.vtmc.vaclav;

public class Main {

	public static void main(String[] args) {
//		Person person1 = new Person();
//		person1.name = "Tadas";
//		person1.age = 25;
//		person1.speak();
//		person1.hello();
//		System.out.println(person1.calculateRetirement());
//		person1.setName("");
//		person1.setAge(25);
		
//		Person person2 = new Person();
//		person2.name = "Agne";
//		person2.age = 23;
//		person2.hello();
//		person2.calculateRetirement();
//		person2.setName("Agne");
//		person2.setAge(-23);
		Person person1 = new Person("Katinas", 12, "Nice cat");
		Person person2 = new Person("Agne", 24, "Nice woman");
		Person person3 = new Person("Tadas", 25, "Nice men");
		System.out.println(person2.getAboutPerson());
		System.out.println(person3.getAboutPerson());
		int personNumber = person2.countPerson;
		System.out.println(personNumber);
		
//		System.out.println(person3.getName());
		
		
//		System.out.println(person1);
//		System.out.println(person2);
		
//		System.out.println(person1.getName() + ", " + person1.getAge());
//		System.out.println(person2.getName() + ", " + person2.getAge());
		
		Product product1 = new Product("Milk", 0.69);
		System.out.println(product1.getPriceWithPvm());
		Product product2 = new Product("Chocolate", 2.54);
		System.out.println(product2.getPriceWithPvm());
		
		System.out.println(person1);
		System.out.println(product1);
		
//		Product product3 = new Product();
//		System.out.println(product3);
	}

}
