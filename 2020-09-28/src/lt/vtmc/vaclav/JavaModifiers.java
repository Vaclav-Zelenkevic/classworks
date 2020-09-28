package lt.vtmc.vaclav;

public class JavaModifiers {

	public static void main(String[] args) {
		print();
		Product pr = new Product();
		pr.getPrice();
	}
	
	private static void print() {
		System.out.println("Hello World!");
	}

}
