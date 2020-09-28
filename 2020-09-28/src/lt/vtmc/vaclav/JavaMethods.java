package lt.vtmc.vaclav;

import java.util.Arrays;
import java.util.Scanner;

class JavaMethods {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		printSome();
		int intNumber = 20;
		printSome(intNumber);
		double doubleNumber = 45.89;
		printSome(doubleNumber);
		String[] names = {"Tomas", "Tadas", "Kelly"};
		printSome(names);
		System.out.println("Enter trees number: ");
		int treesNumber = input.nextInt();
		String[] trees = new String[treesNumber];
		int[] treesHeight = new int[treesNumber];
		printSome(trees, trees.length);	
//		printSome(trees, treesHeight);
	}
	
	private static String[] printSome(String[] trees, int arraySize) {
		
		for(int i = 0; i < trees.length; i++) {
			System.out.println("Please input tree name: ");
			trees[i] = input.nextLine();
		}
		printSome(trees);
		return trees;
	}
	
	public static void printSome() {
		System.out.println("Hello World!");
	}
	
	public static void printSome(int intNumber) {
		System.out.println(intNumber);
	}
	
	public static void printSome(double doubleNumber) {
		System.out.println(doubleNumber);
	}
	
	public static void printSome(String[] names) {
		System.out.println(Arrays.toString(names));
	}

}
