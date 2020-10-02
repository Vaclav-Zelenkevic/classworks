package lt.vtmc.vaclav.auau;

public class Room {

	public static void main(String[] args) {
		Room room = new Room();
		
		Human human = new Human("Tadas", "Sarikas");
		System.out.println(human);		
		human.sayEat();
		
		Cat cat = new Cat("Aukse");
		System.out.println(cat);
		cat.run(human.say());
	}
}
