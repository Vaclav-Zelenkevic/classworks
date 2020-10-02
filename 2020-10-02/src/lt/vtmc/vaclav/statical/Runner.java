package lt.vtmc.vaclav.statical;

public class Runner {

	public static void main(String[] args) {
		StaticObject one = new StaticObject();
		StaticObject two = new StaticObject();
		
		one.age = 45;
		two.age = 23;
		System.out.println(one.age);
		System.out.println(two.age);
		
		one.name = "Tadas";
		System.out.println(one.name);
		two.name = "Agne";
		System.out.println(one.name);
		System.out.println(two.name);
		
	}

}
