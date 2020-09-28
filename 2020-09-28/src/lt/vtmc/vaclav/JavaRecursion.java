package lt.vtmc.vaclav;

public class JavaRecursion {

	public static void main(String[] args) {
		makeSimpleRecusion(5);
		makeDifficultRecursion(5);
	}

	private static void makeDifficultRecursion(int number) {
		System.out.println("First  second method section: " + number);
		makeSimpleRecusion(number);
		System.out.println("Second second method section: " + number);
		
	}

	private static void makeSimpleRecusion(int number) {
		number--;
		System.out.println("First method section: " + number);
		if(number != 0) {
			makeSimpleRecusion(number);
			makeDifficultRecursion(number);
		}
		System.out.println("Second method section: " + number);
	}

}
